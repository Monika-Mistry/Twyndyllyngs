package com.bae.finance.service;

import com.bae.finance.domain.AtmTransactionLocations;

public interface AtmTransactionLocationsService {

	AtmTransactionLocations[] findByForenames(String forenames);
	
	AtmTransactionLocations[] findBySurname(String surname);
	
	AtmTransactionLocations[] findByForenamesAndSurname(String forenames, String surname);
	
	AtmTransactionLocations[] findByCardNumber(String cardNumber);
}
