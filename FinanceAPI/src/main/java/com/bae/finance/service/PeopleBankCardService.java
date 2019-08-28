package com.bae.finance.service;

import com.bae.finance.domain.PeopleBankCard;

public interface PeopleBankCardService {

	PeopleBankCard[] findByForenamesAndSurnameAndAddress(String forenames, String surname, String address);
}
