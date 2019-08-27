package com.bae.finance.service;

import com.bae.finance.domain.EposTransactionLocations;

public interface EposTransactionLocationsService {

	EposTransactionLocations[] findByForenames(String forenames);
	
	EposTransactionLocations[] findBySurname(String surname);
	
	EposTransactionLocations[] findByForenamesAndSurname(String forenames, String surname);
	
	EposTransactionLocations[] findByCardNumber(String cardNumber);
	
	
	
}
