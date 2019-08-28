package com.bae.rest;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.domain.Citizen;
import com.bae.domain.Request;

@RestController
@RequestMapping("/citizen")
public class CitizenController extends Controller {

	private RestTemplate restTemplate;
	private JmsTemplate jmsTemplate;

	public CitizenController(@Autowired RestTemplate restTemplate, JmsTemplate jmsTemplate) {
		super(jmsTemplate);
		this.restTemplate = restTemplate;
	}

	@GetMapping("/{forename}/{surname}/{address}")
	public ResponseEntity<Citizen[]> getAllCitizens(
			@PathVariable("forename") String forename,
			@PathVariable("surname") String surname, 
			@PathVariable("address") String address,
			@RequestHeader("username") String username) {
		if (forename.equals("null")) {
			ResponseEntity<Citizen[]> citizenSurname = getCitizenBySurname(surname, username);
			Citizen[] citizen = citizenSurname.getBody();
			return new ResponseEntity<>(citizen, HttpStatus.OK);
		} else if (surname.equals("null")) {
			ResponseEntity<Citizen[]> citizenForename = getCitizenByForename(forename, username);
			Citizen[] citizen = citizenForename.getBody();
			return new ResponseEntity<>(citizen, HttpStatus.OK);

		} else if (address.equals("null")) {
			ResponseEntity<Citizen[]> citizenFullname = getCitizenByFullname(forename, surname, username);
			Citizen[] citizen = citizenFullname.getBody();
			return new ResponseEntity<>(citizen, HttpStatus.OK);
	
		} else {
			ResponseEntity<Citizen[]> citizenFullnameAndAddress = getCitizenByFullnameAndAddress(forename, surname, address, username);
			Citizen[] citizen = citizenFullnameAndAddress.getBody();
			return new ResponseEntity<>(citizen, HttpStatus.OK);
		}

	}


	@GetMapping("/getCitizensByForenames/{forenames}")
	public ResponseEntity<Citizen[]> getCitizenByForename(
			@PathVariable("forenames") String forenames,
			@RequestHeader("username") String username) {
		
		sendToQueue(new Request(username,"/getCitizensBySurname/" + forenames, new Timestamp(System.currentTimeMillis())));
		
		return restTemplate.getForEntity(Constants.CITIZEN_FORENAME_URL + forenames, Citizen[].class);

	}

	@GetMapping("/getCitizensBySurname/{surname}")
	public ResponseEntity<Citizen[]> getCitizenBySurname(
			@PathVariable("surname") String surname,
			@RequestHeader("username") String username) {
		
		sendToQueue(new Request(username,"/getCitizensBySurname/" + surname, new Timestamp(System.currentTimeMillis())));

		return restTemplate.getForEntity(Constants.CITIZEN_SURNAME_URL + surname, Citizen[].class);

	}

	@GetMapping("/getCitizensByFullname/{forenames}/{surname}")
	public ResponseEntity<Citizen[]> getCitizenByFullname(
			@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname,
			@RequestHeader("username") String username) {
		
		sendToQueue(new Request(username,"/getCitizensByFullname/" + forenames + "/" + surname, new Timestamp(System.currentTimeMillis())));

		return restTemplate.getForEntity(Constants.CITIZEN_FULLNAME_URL + forenames + "/" + surname, Citizen[].class);
	}

	@GetMapping("/getCitizensByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<Citizen[]> getCitizenByFullnameAndAddress(
			@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname,
			@PathVariable("address") String address,
			@RequestHeader("username") String username) {
		
		sendToQueue(new Request(username,"/getCitizensByFullnameAndAddress/" + forenames + "/" + surname + "/" + address, new Timestamp(System.currentTimeMillis())));

		return restTemplate.getForEntity(Constants.CITIZEN_FULLNAME_AND_ADDRESS_URL + forenames + "/" + surname + "/" + address, Citizen[].class);

	}

}
