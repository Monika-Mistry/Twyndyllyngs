package com.bae.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.finance.domain.PeopleBankCard;
import com.bae.finance.repository.PeopleBankCardRepository;

@Service
public class PeopleBankCardServiceImplementation implements PeopleBankCardService {

	private PeopleBankCardRepository pbadRepository;

	public PeopleBankCardServiceImplementation() {
	}

	@Autowired
	public List<PeopleBankCard> findByForenamesAndSurname(String forenames, String surname) {
		return pbadRepository.findByForenamesAndSurname(forenames, surname);
	}

}
