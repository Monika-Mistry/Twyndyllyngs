package com.bae.citizen.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.citizen.domain.Citizen;
import com.bae.citizen.service.CitizenService;

@RestController
public class CitizenController {

	private CitizenService citizenService;

	public CitizenController() {

	}

	@Autowired
	public CitizenController(CitizenService citizenService) {

		this.citizenService = citizenService;
	}

	@GetMapping("/getCitizensByForenames/{forenames}")
	public List<Citizen> findCitizensByForenames(@PathVariable("forenames") String forenames) {

		return citizenService.findByForenames(forenames);
	}

	@GetMapping("/getCitizensBySurname/{surname}")
	public List<Citizen> findCitizensBySurname(@PathVariable("surname") String surname) {

		return citizenService.findBySurname(surname);
	}

	@GetMapping("/getCitizensByFullname/{forenames}/{surname}")
	public List<Citizen> findCitizensByFullname(@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname) {

		return citizenService.findByForenamesAndSurname(forenames, surname);
	}

	@GetMapping("/getCitizenById/{citizenId}")
	public Citizen findCitizenById(@PathVariable("citizenId") Long citizenId) {

		return citizenService.findById(citizenId);
	}

}
