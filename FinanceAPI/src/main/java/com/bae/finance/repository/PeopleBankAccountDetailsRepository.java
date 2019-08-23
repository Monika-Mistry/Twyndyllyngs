package com.bae.finance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.PeopleBankAccountDetails;

@Repository
public interface PeopleBankAccountDetailsRepository extends CrudRepository<PeopleBankAccountDetails, Long> {
	
}
