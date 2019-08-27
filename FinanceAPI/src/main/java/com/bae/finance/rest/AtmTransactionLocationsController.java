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
	
	
	@GetMapping("/getAtmTransactionsByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<AtmTransactionLocations[]> findATMTransactionsByFullnameAndAddress(@PathVariable("forenames") String forenames, @PathVariable("surname") String surname, @PathVariable("address") String address) {
		
		return new ResponseEntity<AtmTransactionLocations[]>(transactionLocationsService.findATMTransactionsByFullnameAndAddress(forenames, surname, address), HttpStatus.OK);
	}
	
	@GetMapping("/getAtmTransactionsByCardNumber/{cardNumber}")
	public ResponseEntity<AtmTransactionLocations[]> findATMTransactionsByCardNumber(@PathVariable("cardNumber") String cardNumber) {
		
		return new ResponseEntity<AtmTransactionLocations[]>(transactionLocationsService.findByCardNumber(cardNumber), HttpStatus.OK);
	}
	
}
