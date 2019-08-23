package com.bae.finance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.ATMTransactionLocation;


@Repository
public interface ATMTransactionLocationRepository extends CrudRepository<ATMTransactionLocation, Long>{

	public List<ATMTransactionLocation> findByForenames(String forenames);
	
	public List<ATMTransactionLocation> findBySurname(String surname);
	
	public List<ATMTransactionLocation> findByForenamesAndSurname(String forenames, String surname);

}
