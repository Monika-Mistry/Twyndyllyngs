package com.bae.citizen.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.citizen.domain.Citizen;
import com.bae.citizen.service.CitizenService;

@RestController
public class CitizenController {

	private CitizenService citizenService;

	@Autowired
	public CitizenController(CitizenService citizenService) {

		this.citizenService = citizenService;
	}

	@GetMapping("/getCitizensByForenames/{username}/{forenames}")
	public ResponseEntity<Citizen[]> findCitizensByForenames(@PathVariable("forenames") String forenames) {

		return new ResponseEntity<Citizen[]>(citizenService.findByForenames(forenames), HttpStatus.OK);
	}

	@GetMapping("/getCitizensBySurname/{username}/{surname}")
	public ResponseEntity<Citizen[]> findCitizensBySurname(@PathVariable("surname") String surname) {
		return new ResponseEntity<Citizen[]>(citizenService.findBySurname(surname), HttpStatus.OK);

	}

	@GetMapping("/getCitizensByFullname/{username}/{forenames}/{surname}")
	public ResponseEntity<Citizen[]> findCitizensByFullname(@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname) {
		return new ResponseEntity<Citizen[]>(citizenService.findByForenamesAndSurname(forenames, surname),
				HttpStatus.OK);
	}

	@GetMapping("/getCitizenById/{username}/{citizenId}")
	public Citizen findCitizenById(@PathVariable("citizenId") Long citizenId) {

		return citizenService.findById(citizenId);
	}

}