package com.bae.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.finance.domain.EposTransactionLocations;
import com.bae.finance.repository.EposTransactionLocationsRepository;

@Service
public class EposTransactionLocationsServiceImplementation implements EposTransactionLocationsService{

	private EposTransactionLocationsRepository eposRepository;
	
	@Autowired
	public EposTransactionLocationsServiceImplementation(EposTransactionLocationsRepository eposRepository) {

		this.eposRepository = eposRepository;
	}



	public EposTransactionLocations[] findByForenamesAndSurnameAndAddress(String forenames, String surname, String address) {
		
		List<EposTransactionLocations> eposTransactionList = eposRepository.findByForenamesAndSurnameAndHomeAddress(forenames, surname, address);
		
		return eposTransactionList.toArray(new EposTransactionLocations[eposTransactionList.size()]);
		
	}

	
	public EposTransactionLocations[] findByCardNumber(String cardNumber) {

		List<EposTransactionLocations> eposTransactionList = eposRepository.findByCardNumber(cardNumber);
		
		return eposTransactionList.toArray(new EposTransactionLocations[eposTransactionList.size()]);
	}
	
}
