package com.bae.finance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.EposTransactionLocations;

@Repository
public interface EposTransactionLocationsRepository extends CrudRepository<EposTransactionLocations, Long>{

	
	public List<EposTransactionLocations> findByForenamesAndSurnameAndHomeAddress(String forenames, String surname, String homeAddress);
	
	public List<EposTransactionLocations> findByCardNumber(String cardNumber);
	
}
