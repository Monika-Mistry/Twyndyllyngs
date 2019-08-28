package com.bae.finance.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.finance.domain.PeopleBankCard;
import com.bae.finance.service.PeopleBankCardService;

@RestController
public class PeopleBankCardController {

	private PeopleBankCardService peopleBankCardService;

	@Autowired
	public PeopleBankCardController(PeopleBankCardService peopleBankCardService) {
		this.peopleBankCardService = peopleBankCardService;
	}

	@GetMapping("/getBankAccountDetailsByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<PeopleBankCard[]> findBankAccountDetailsByFullnameAndAddress(
			@PathVariable("forenames") String forenames, 
			@PathVariable("surname") String surname,
			@PathVariable("address") String address) {
		return new ResponseEntity<>(peopleBankCardService.findByForenamesAndSurnameAndAddress(forenames, surname, address), HttpStatus.OK);
	}

}
