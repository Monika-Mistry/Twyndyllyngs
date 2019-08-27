package com.bae.finance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.PeopleBankCard;

@Repository
public interface PeopleBankCardRepository extends CrudRepository<PeopleBankCard, Long> {
	
	public List<PeopleBankCard> findByForenamesAndSurname(String forenames, String surname);
}
