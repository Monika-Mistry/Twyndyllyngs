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
	
	@GetMapping("/getEposTransactionsByForenames")
	public ResponseEntity<EposTransactionLocations[]> findEposTransactionsByForenames(@PathVariable("forenames") String forenames){
		
		return new ResponseEntity<EposTransactionLocations[]>(eposService.findByForenames(forenames), HttpStatus.OK);
	}
	
	@GetMapping("/getEposTransactionsBySurname")
	public ResponseEntity<EposTransactionLocations[]> findEposTransactionsBySurname(@PathVariable("surname") String surname){
		
		return new ResponseEntity<EposTransactionLocations[]>(eposService.findBySurname(surname), HttpStatus.OK);
	}
	
	@GetMapping("/getEposTransactionsByForenamesAndSurname")
	public ResponseEntity<EposTransactionLocations[]> findEposTransactionsByForenamesAndSurname(@PathVariable("forenames") String forenames, @PathVariable("surname") String surname){
		
		return new ResponseEntity<EposTransactionLocations[]>(eposService.findByForenamesAndSurname(forenames, surname), HttpStatus.OK);
	}
	
	@GetMapping("/getEposTransactionsByCardNumber")
	public ResponseEntity<EposTransactionLocations[]> findEposTransactionsByCardNumber(@PathVariable("cardNumber") String cardNumber){
		
		return new ResponseEntity<EposTransactionLocations[]>(eposService.findByCardNumber(cardNumber), HttpStatus.OK);
	}
	
	
}
