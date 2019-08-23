package com.bae.finance.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.finance.domain.PeopleBankAccountDetails;
import com.bae.finance.service.PeopleBankAccountDetailsService;

@RestController
public class PeopleBankAccountDetailsController {

	private PeopleBankAccountDetailsService pbadService;

	public PeopleBankAccountDetailsController() {
	}

	@Autowired
	public PeopleBankAccountDetailsController(PeopleBankAccountDetailsService pbadService) {
		this.pbadService = pbadService;
	}

	@GetMapping("/getBankAccountDetailsByFullname/{forenames}/{surname}")
	public List<PeopleBankAccountDetails> findBankAccountDetailsByFullname(@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname) {
		return pbadService.findByForenamesAndSurname(forenames, surname);
	}

}
