package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.domain.Citizen;
import com.bae.domain.VehicleLocation;

@RestController
public class CitizenController extends Controller{

	private RestTemplate restTemplate;
	private JmsTemplate jmsTemplate;

	

	public CitizenController(@Autowired RestTemplate restTemplate, JmsTemplate jmsTemplate) {
		super(jmsTemplate);
		this.restTemplate = restTemplate;
	}

	@GetMapping("/{forename}/{surname}")
	public ResponseEntity<Citizen> getAllCitizens(@PathVariable("forename") String forename,
			@PathVariable("surname") String surname) {

		if (forename == "null") {
			ResponseEntity<Citizen> citizenSurname = getCitizenBySurname(surname);
			Citizen citizen = citizenSurname.getBody();
			return new ResponseEntity<Citizen>(citizen, HttpStatus.OK);
		} else if (surname == "null") {
			ResponseEntity<Citizen> citizenForename = getCitizenByForename(forename);
			Citizen citizen = citizenForename.getBody();
			return new ResponseEntity<Citizen>(citizen, HttpStatus.OK);

		} else {
			ResponseEntity<Citizen> citizenFullname = getCitizenByFullname(forename, surname);
			Citizen citizen = citizenFullname.getBody();
			return new ResponseEntity<Citizen>(citizen, HttpStatus.OK);
		}

	}

	@GetMapping("/getCitizensByForenames/{forenames}")
	private ResponseEntity<Citizen> getCitizenByForename(
			@PathVariable("forenames") String forenames) {
		return restTemplate.getForEntity(Constants.CITIZEN_FORENAME_URL + forenames, Citizen.class);

	}
	
	@GetMapping("/getCitizensBySurname/{surname}")
	private ResponseEntity<Citizen> getCitizenBySurname(
			@PathVariable("surname") String surname) {
		return restTemplate.getForEntity(Constants.CITIZEN_SURNAME_URL + surname, Citizen.class);

	}
	
	@GetMapping("/getCitizensByFullname/{forenames}/{surname}")
	private ResponseEntity<Citizen> getCitizenByFullname(
			@PathVariable("forenames") String forenames, @PathVariable("surname") String surname) {
		return restTemplate.getForEntity(Constants.CITIZEN_FULLNAME_URL + forenames + "/" + surname, Citizen.class);

	}
	
	@GetMapping("/getCitizenById/{citizenId}")
	private ResponseEntity<Citizen> getCitizenById(
			@PathVariable("citizenId") String citizenId) {
		return restTemplate.getForEntity(Constants.CITIZEN_ID_URL + citizenId, Citizen.class);

	}

}
