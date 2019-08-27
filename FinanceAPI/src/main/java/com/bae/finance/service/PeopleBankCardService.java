package com.bae.finance.service;

import com.bae.finance.domain.PeopleBankCard;

public interface PeopleBankCardService {

	PeopleBankCard[] findByForenamesAndSurname(String forenames, String surname);
}
