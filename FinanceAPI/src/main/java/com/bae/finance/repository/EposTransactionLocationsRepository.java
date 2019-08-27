package com.bae.finance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.EposTransactionLocations;

@Repository
public interface EposTransactionLocationsRepository extends CrudRepository<EposTransactionLocations, Long>{

	public List<EposTransactionLocations> findByForenames(String forenames);
	
	public List<EposTransactionLocations> findBySurname(String surname);
	
	public List<EposTransactionLocations> findByForenamesAndSurname(String forenames, String surname);
	
	public List<EposTransactionLocations> findByCardNumber(String cardNumber);
	
}
