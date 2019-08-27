package com.bae.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.finance.domain.PeopleBankCard;
import com.bae.finance.repository.PeopleBankCardRepository;

@Service
public class PeopleBankCardServiceImplementation implements PeopleBankCardService {

	private PeopleBankCardRepository peopleBankCardRepository;

	@Autowired
	public PeopleBankCardServiceImplementation(PeopleBankCardRepository peopleBankCardRepository) {
		
		this.peopleBankCardRepository = peopleBankCardRepository;
	}

	
	public PeopleBankCard[] findByForenamesAndSurname(String forenames, String surname) {
		List<PeopleBankCard> bankCardList = peopleBankCardRepository.findByForenamesAndSurname(forenames, surname);
		
		return bankCardList.toArray(new PeopleBankCard[bankCardList.size()]);
	}

}
