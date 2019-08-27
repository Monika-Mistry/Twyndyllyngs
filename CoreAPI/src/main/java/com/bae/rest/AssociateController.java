package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.domain.Associate;

@RestController
@RequestMapping("/associate")
public class AssociateController extends Controller {
	
	private RestTemplate restTemplate;
	private JmsTemplate jmsTemplate;

	public AssociateController(@Autowired RestTemplate restTemplate, JmsTemplate jmsTemplate) {
		super(jmsTemplate);
		this.restTemplate = restTemplate;
	}
	

	@GetMapping("/getAssociatesByFullNameAndAddress/{forename}/{surname}/{address}")
	public ResponseEntity<Associate[]> getAssociatesByFullNameAndAddress(
			@PathVariable("forenames") String forenames, 
			@PathVariable("surname") String surname,
			@PathVariable("address") String address) 
	{

			return restTemplate.getForEntity(Constants.ASSOCIATE_FULLNAME_ADDRESS_URL + forenames + "/" + surname + "/" +  address, Associate[].class);
	}
	
	
	@GetMapping("/getAssociatesByPhoneNumber/{phoneNumber}")
	public ResponseEntity<Associate[]> getAssociatesByPhoneNumber(
			@PathVariable("phoneNumber") String phoneNumber) 
	{

			return restTemplate.getForEntity(Constants.ASSOCIATE_PHONE_NUMBER_URL + phoneNumber, Associate[].class);
	}
	
	
	

}
