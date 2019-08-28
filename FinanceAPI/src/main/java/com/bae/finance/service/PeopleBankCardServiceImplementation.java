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

	
	public PeopleBankCard[] findByForenamesAndSurnameAndAddress(String forenames, String surname, String address) {
		List<PeopleBankCard> bankCardList = peopleBankCardRepository.findByForenamesAndSurnameAndHomeAddress(forenames, surname, address);
		
		return bankCardList.toArray(new PeopleBankCard[bankCardList.size()]);
	}

}
