package com.bae.finance.service;

import com.bae.finance.domain.EposTransactionLocations;

public interface EposTransactionLocationsService {


	EposTransactionLocations[] findByForenamesAndSurnameAndAddress(String forenames, String surname, String address);
	
	EposTransactionLocations[] findByCardNumber(String cardNumber);
	
	
	
}
