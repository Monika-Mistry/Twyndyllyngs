package com.bae.finance.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.finance.domain.AtmTransactionLocations;
import com.bae.finance.service.AtmTransactionLocationsService;

@RestController
public class AtmTransactionLocationsController {


	private AtmTransactionLocationsService transactionLocationsService;
	
	@Autowired
	public AtmTransactionLocationsController(AtmTransactionLocationsService transactionLocationsService) {
		this.transactionLocationsService = transactionLocationsService;
	}
	
	@GetMapping("/getAtmTransactionsByForenames/{forenames}")
	public ResponseEntity<AtmTransactionLocations[]> findATMTransactionsByForenames(@PathVariable("forenames") String forenames) {
		
		return new ResponseEntity<AtmTransactionLocations[]>(transactionLocationsService.findByForenames(forenames), HttpStatus.OK);
	}
	
	@GetMapping("/getAtmTransactionsBySurname/{surname}")
	public ResponseEntity<AtmTransactionLocations[]> findATMTransactionsBySurname(@PathVariable("surname") String surname) {
		
		return new ResponseEntity<AtmTransactionLocations[]>(transactionLocationsService.findBySurname(surname), HttpStatus.OK);
	}
	
	@GetMapping("/getAtmTransactionsByForenamesAndSurname/{forenames}/{surname}")
	public ResponseEntity<AtmTransactionLocations[]> findATMTransactionsByForenames(@PathVariable("forenames") String forenames, @PathVariable("surname") String surname) {
		
		return new ResponseEntity<AtmTransactionLocations[]>(transactionLocationsService.findByForenamesAndSurname(forenames, surname), HttpStatus.OK);
	}
	
	@GetMapping("/getAtmTransactionsByCardNumber/{cardNumber}")
	public ResponseEntity<AtmTransactionLocations[]> findATMTransactionsByCardNumber(@PathVariable("cardNumber") String cardNumber) {
		
		return new ResponseEntity<AtmTransactionLocations[]>(transactionLocationsService.findByCardNumber(cardNumber), HttpStatus.OK);
	}
	
}
