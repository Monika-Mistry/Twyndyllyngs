package com.bae.mobile.rest;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.mobile.domain.PeopleMobile;
import com.bae.mobile.service.PeopleMobileService;

@RestController
public class PeopleMobileController {

	private PeopleMobileService peopleMobileService;

	@Autowired
	public PeopleMobileController(PeopleMobileService peopleMobileService) {

		this.peopleMobileService = peopleMobileService;
	}
	
	
	@GetMapping("/getMobileByForenames/{forenames}")
	public ResponseEntity<PeopleMobile[]> findMobileByForenames(@PathVariable("forenames") String forenames) {
		
		return new ResponseEntity<>(peopleMobileService.findByForenames(forenames), HttpStatus.OK);
 		
	}
	
	@GetMapping("/getMobileBySurname/{surname}")
	public ResponseEntity<PeopleMobile[]> findMobileBySurname(@PathVariable("surname") String surname) {
		
		return new ResponseEntity<>(peopleMobileService.findBySurname(surname), HttpStatus.OK);
		
	}
	
	@GetMapping("/getMobileByFullname/{forenames}/{surname}")
	public ResponseEntity<PeopleMobile[]> findMobileByFullname(@PathVariable("forenames") String forenames, @PathVariable("surname") String surname) {
		
		return new ResponseEntity<>(peopleMobileService.findByForenamesAndSurname(forenames, surname), HttpStatus.OK);
		
	}
	
 	
	@GetMapping("/getMobileByNumber/{phoneNumber}")
	public ResponseEntity<PeopleMobile[]> findMobilebyPhoneNumber(@PathVariable("phoneNumber") String phoneNumber) {
		
		return new ResponseEntity<>(peopleMobileService.findByPhoneNumber(phoneNumber), HttpStatus.OK);
		
	}
	


}
