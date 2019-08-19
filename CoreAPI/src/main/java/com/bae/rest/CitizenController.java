package com.bae.rest;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.Constants;
import com.bae.domain.Citizen;
import com.bae.domain.Request;

@RestController
public class CitizenController extends Controller {

	private RestTemplate restTemplate;

	public CitizenController(@Autowired JmsTemplate jmsTemplate, @Autowired RestTemplate restTemplate) {
		super(jmsTemplate);
		this.restTemplate = restTemplate;
	}

	@GetMapping("getCitizensByForenames/{username}/{forenames}")
	public ResponseEntity<List<Citizen>> findCitizenByForenames(@PathVariable("forenames") String forenames,
			@PathVariable("username") String username) {

		Request request = new Request(username, forenames, new Timestamp(System.currentTimeMillis()));

		sendToQueue(request);

		return restTemplate.exchange(Constants.CITIZEN_URL + "/getCitizensByForenames/" + username + "/" + forenames,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Citizen>>() {
				});

	}

	@GetMapping("/getCitizensBySurname/{username}/{surname}")
	public ResponseEntity<List<Citizen>> findCitizenBySurname(@PathVariable("surname") String surname,
			@PathVariable("username") String username) {
		Request request = new Request(username, surname, new Timestamp(System.currentTimeMillis()));

		sendToQueue(request);

		return restTemplate.exchange(Constants.CITIZEN_URL + "/getCitizensByForenames/" + username + "/" + surname,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Citizen>>() {
				});
	}

	@GetMapping("/getCitizensByFullname/{username}/{forenames}/{surname}")
	public ResponseEntity<List<Citizen>> findCitizenByForenamesAndSurname(@PathVariable("forenames") String forenames,@PathVariable("surname") String surname,
			@PathVariable("username") String username) {
		Request request = new Request(username, forenames + " " + surname, new Timestamp(System.currentTimeMillis()));

		sendToQueue(request);

		return restTemplate.exchange(Constants.CITIZEN_URL + "/getCitizensByForenames/" + username + "/" + forenames + "/" + surname,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Citizen>>() {
				});
	}

	@GetMapping("/getCitizenById/{username}/{citizenId}")
	public Citizen findCitizenById(@PathVariable("id") Long id,
			@PathVariable("username") String username) {
		Request request = new Request(username,"Citizen ID:" +  id, new Timestamp(System.currentTimeMillis()));

		sendToQueue(request);

		return restTemplate.getForObject(Constants.CITIZEN_URL + "/getCitizensByForenames/" + username + "/" + id, Citizen.class);
	}

}
