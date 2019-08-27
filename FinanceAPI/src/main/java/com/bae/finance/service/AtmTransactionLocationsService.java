package com.bae.finance.service;

import com.bae.finance.domain.AtmTransactionLocations;

public interface AtmTransactionLocationsService {
	
	AtmTransactionLocations[] findATMTransactionsByFullnameAndAddress(String forenames, String surname, String address);
	
	AtmTransactionLocations[] findByCardNumber(String cardNumber);
}
