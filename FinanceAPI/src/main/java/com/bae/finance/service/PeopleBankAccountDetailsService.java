package com.bae.finance.service;

import java.util.List;

import com.bae.finance.domain.PeopleBankAccountDetails;

public interface PeopleBankAccountDetailsService {

	List<PeopleBankAccountDetails> findByForenamesAndSurname(String forenames, String surname);

}
