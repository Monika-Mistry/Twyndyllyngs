package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.Constants;
import com.bae.domain.Citizen;

@RestController
public class CitizenController extends Controller {

	private RestTemplate restTemplate;

	public CitizenController(@Autowired JmsTemplate jmsTemplate, @Autowired RestTemplate restTemplate) {
		super(jmsTemplate);
		this.restTemplate = restTemplate; 
	}

	@GetMapping("/getCitizensByForenames/{username}/{forenames}")
	public ResponseEntity<Citizen[]> findCitizenByForenames(@PathVariable("forenames") String forenames,
			@PathVariable("username") String username) {


		return restTemplate.exchange(Constants.CITIZEN_FORENAME_URL + username + "/" + forenames,
				HttpMethod.GET, null, Citizen[].class); 

	}

	@GetMapping("/getCitizensBySurname/{username}/{surname}")
	public ResponseEntity<Citizen[]> findCitizenBySurname(@PathVariable("surname") String surname,
			@PathVariable("username") String username) {


		return restTemplate.exchange(Constants.CITIZEN_SURNAME_URL + username + "/" + surname,
				HttpMethod.GET, null, Citizen[].class);
	}

	@GetMapping("/getCitizensByFullname/{username}/{forenames}/{surname}")
	public ResponseEntity<Citizen[]> findCitizenByForenamesAndSurname(@PathVariable("forenames") String forenames,@PathVariable("surname") String surname,
			@PathVariable("username") String username) {


		return restTemplate.exchange(Constants.CITIZEN_FULLNAME_URL + username + "/" + forenames + "/" + surname,
				HttpMethod.GET, null, Citizen[].class);
	}

	@GetMapping("/getCitizenById/{username}/{citizenId}")
	public Citizen findCitizenById(@PathVariable("id") Long id,
			@PathVariable("username") String username) {


		return restTemplate.getForObject(Constants.CITIZEN_ID_URL + username + "/" + id, Citizen.class);
	}

}
