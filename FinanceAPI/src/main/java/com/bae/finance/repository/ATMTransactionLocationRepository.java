package com.bae.finance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.ATMTransactionLocation;


@Repository
public interface ATMTransactionLocationRepository extends CrudRepository<ATMTransactionLocation, Long>{

	
}
