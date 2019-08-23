package com.bae.finance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.PeopleBankAccountDetails;

@Repository
public interface PeopleBankAccountDetailsRepository extends CrudRepository<PeopleBankAccountDetails, Long> {

	public List<PeopleBankAccountDetails> findByForenamesAndSurname(String forenames, String surname);

}
