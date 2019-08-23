package com.bae.finance.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.finance.domain.PeopleBankCard;
import com.bae.finance.service.PeopleBankCardService;

@RestController
public class PeopleBankCardController {

	private PeopleBankCardService pbadService;

	public PeopleBankCardController() {
	}

	@Autowired
	public PeopleBankCardController(PeopleBankCardService pbadService) {
		this.pbadService = pbadService;
	}

	@GetMapping("/getBankAccountDetailsByFullname/{forenames}/{surname}")
	public List<PeopleBankCard> findBankAccountDetailsByFullname(@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname) {
		return pbadService.findByForenamesAndSurname(forenames, surname);
	}

}
