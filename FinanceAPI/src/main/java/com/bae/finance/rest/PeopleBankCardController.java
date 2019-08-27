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

	@GetMapping("/getBankAccountDetailsByFullname/{forenames}/{surname}")
	public ResponseEntity<PeopleBankCard[]> findBankAccountDetailsByFullname(@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname) {
		return new ResponseEntity<>(peopleBankCardService.findByForenamesAndSurname(forenames, surname), HttpStatus.OK);
	}

}
