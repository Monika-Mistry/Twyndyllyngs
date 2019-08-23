package com.bae.finance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.AtmTransactionLocations;


@Repository
public interface AtmTransactionLocationsRepository extends CrudRepository<AtmTransactionLocations, Long>{

	public List<AtmTransactionLocations> findByForenames(String forenames);
	
	public List<AtmTransactionLocations> findBySurname(String surname);
	
	public List<AtmTransactionLocations> findByForenamesAndSurname(String forenames, String surname);

	public List<AtmTransactionLocations> findByCardNumber(String cardNumber);
	
}
 