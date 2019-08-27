package com.bae.finance.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.finance.domain.EposTransactionLocations;
import com.bae.finance.service.EposTransactionLocationsService;

@RestController
public class EposTransactionLocationsController {


	private EposTransactionLocationsService eposService;
	
	@Autowired
	public EposTransactionLocationsController(EposTransactionLocationsService eposService) {

		this.eposService = eposService;
	}
	
	
	@GetMapping("/getEposTransactionsByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<EposTransactionLocations[]> findEposTransactionsByFullnameAndAddress(@PathVariable("forenames") String forenames, @PathVariable("surname") String surname, @PathVariable("address") String address){
		
		return new ResponseEntity<EposTransactionLocations[]>(eposService.findByForenamesAndSurnameAndAddress(forenames, surname, address), HttpStatus.OK);
	}
 	
	@GetMapping("/getEposTransactionsByCardNumber/{cardNumber}")
	public ResponseEntity<EposTransactionLocations[]> findEposTransactionsByCardNumber(@PathVariable("cardNumber") String cardNumber){
		
		return new ResponseEntity<EposTransactionLocations[]>(eposService.findByCardNumber(cardNumber), HttpStatus.OK);
	}
	
	
}
