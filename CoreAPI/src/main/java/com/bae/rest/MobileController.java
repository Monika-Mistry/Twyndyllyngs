package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.domain.MobileCallRecords;
import com.bae.domain.PeopleMobile;

@RestController
@RequestMapping("/mobile")
public class MobileController extends Controller{
	
	private RestTemplate restTemplate;
	private JmsTemplate jmsTemplate;
	
	public MobileController(@Autowired RestTemplate restTemplate, JmsTemplate jmsTemplate) {
		super(jmsTemplate);
		this.restTemplate = restTemplate;
	}
	
	
	@GetMapping("/getCallRecordsByCaller/{caller}")
	public ResponseEntity<MobileCallRecords[]> getCallRecordsByCaller(
			@PathVariable("caller") String caller) {
		return restTemplate.getForEntity(Constants.MOBILE_CALL_RECORDS_URL + caller, MobileCallRecords[].class);

	}
	
	@GetMapping("/getMobileByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<PeopleMobile[]> getMobileByFullnameAndAddress(
			@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname,
			@PathVariable("address") String address) {
		return restTemplate.getForEntity(Constants.PEOPLE_MOBILE_URL + forenames + "/" + surname +"/" + address, PeopleMobile[].class);

	}

}
