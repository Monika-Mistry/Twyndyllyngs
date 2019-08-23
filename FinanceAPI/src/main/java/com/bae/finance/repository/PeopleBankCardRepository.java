package com.bae.finance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.finance.domain.PeopleBankCard;

@Repository
public interface PeopleBankCardRepository extends CrudRepository<PeopleBankCard, Long> {
	
}
