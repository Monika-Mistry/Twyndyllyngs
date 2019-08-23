package com.bae.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.finance.domain.PeopleBankAccountDetails;
import com.bae.finance.repository.PeopleBankAccountDetailsRepository;

@Service
public class PeopleBankAccountDetailsServiceImplementation implements PeopleBankAccountDetailsService {

	private PeopleBankAccountDetailsRepository pbadRepository;

	public PeopleBankAccountDetailsServiceImplementation() {
	}

	@Autowired
	public List<PeopleBankAccountDetails> findByForenamesAndSurname(String forenames, String surname) {
		return pbadRepository.findByForenamesAndSurname(forenames, surname);
	}

}
