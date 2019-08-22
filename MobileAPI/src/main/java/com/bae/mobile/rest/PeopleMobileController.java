package com.bae.mobile.rest;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bae.mobile.domain.PeopleMobile;
import com.bae.mobile.service.PeopleMobileService;

public class PeopleMobileController {

	private PeopleMobileService peopleMobileService;

	@Autowired
	public PeopleMobileController(PeopleMobileService peopleMobileService) {

		this.peopleMobileService = peopleMobileService;
	}
	
	
	@GetMapping("/getMobileByForenames/{forenames}")
	public ResponseEntity<PeopleMobile[]> findMobileByForenames(@PathVariable("forenames") String forenames) {
		
		return new ResponseEntity<PeopleMobile[]>(peopleMobileService.findByForenames(forenames), HttpStatus.OK);
		
	}
	
	@GetMapping("/getMobileBySurnames/{surnames}")
	public ResponseEntity<PeopleMobile[]> findMobileBySurname(@PathVariable("surname") String surname) {
		
		return new ResponseEntity<PeopleMobile[]>(peopleMobileService.findBySurname(surname), HttpStatus.OK);
		
	}
	
	@GetMapping("/getMobileByFullname/{forenames}/{surname}")
	public ResponseEntity<PeopleMobile[]> findMobileByFullname(@PathVariable("forenames") String forenames, @PathVariable("surname") String surname) {
		
		return new ResponseEntity<PeopleMobile[]>(peopleMobileService.findByForenamesAndSurname(forenames, surname), HttpStatus.OK);
		
	}
	
	@GetMapping("/getMobileByFullnameAndDOB/{forenames}/{surname}/{DOB}")
	public ResponseEntity<PeopleMobile[]> findMobileByFullnameAndDOB(@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname, @PathVariable("DOB") LocalDate DOB) {
		
		return new ResponseEntity<PeopleMobile[]>(peopleMobileService.findByForenamesAndSurnameAndDateOfBirth(forenames, surname, DOB), HttpStatus.OK);
		
	}
 	
	@GetMapping("/getMobileByNumber/{phoneNumber}")
	public ResponseEntity<PeopleMobile[]> findMobilebyPhoneNumber(@PathVariable("phoneNumber") String phoneNumber) {
		
		return new ResponseEntity<PeopleMobile[]>(peopleMobileService.findByPhoneNumber(phoneNumber), HttpStatus.OK);
		
	}

}
