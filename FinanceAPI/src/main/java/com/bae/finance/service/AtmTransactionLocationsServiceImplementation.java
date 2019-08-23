package com.bae.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.finance.domain.AtmTransactionLocations;
import com.bae.finance.repository.AtmTransactionLocationsRepository;

@Service
public class AtmTransactionLocationsServiceImplementation implements AtmTransactionLocationsService{


	private AtmTransactionLocationsRepository atmTransactionLocationsRepository;
	
	@Autowired
	public AtmTransactionLocationsServiceImplementation(
			AtmTransactionLocationsRepository atmTransactionLocationsRepository) {
		
		this.atmTransactionLocationsRepository = atmTransactionLocationsRepository;
	}

	
	public AtmTransactionLocations[] findByForenames(String forenames) {
		
		List<AtmTransactionLocations> transactionList = atmTransactionLocationsRepository.findByForenames(forenames);
		
		return transactionList.toArray(new AtmTransactionLocations[transactionList.size()]);
	}

	
	public AtmTransactionLocations[] findBySurname(String surname) {
		List<AtmTransactionLocations> transactionList = atmTransactionLocationsRepository.findBySurname(surname);
		return transactionList.toArray(new AtmTransactionLocations[transactionList.size()]);
	}

	
	public AtmTransactionLocations[] findByForenamesAndSurname(String forenames, String surname) {
		List<AtmTransactionLocations> transactionList = atmTransactionLocationsRepository.findByForenamesAndSurname(forenames, surname);
		return transactionList.toArray(new AtmTransactionLocations[transactionList.size()]);
	}

	
	public AtmTransactionLocations[] findByCardNumber(String cardNumber) {
		List<AtmTransactionLocations> transactionList = atmTransactionLocationsRepository.findByCardNumber(cardNumber);
		return transactionList.toArray(new AtmTransactionLocations[transactionList.size()]);
	}
	
	
}
