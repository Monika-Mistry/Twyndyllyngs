package com.bae.finance.service;

import java.util.List;

import com.bae.finance.domain.PeopleBankCard;

public interface PeopleBankCardService {

	List<PeopleBankCard> findByForenamesAndSurname(String forenames, String surname);

}
