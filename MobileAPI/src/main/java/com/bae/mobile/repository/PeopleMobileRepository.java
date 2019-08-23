package com.bae.mobile.repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.mobile.domain.PeopleMobile;

@Repository
public interface PeopleMobileRepository extends CrudRepository<PeopleMobile, Integer> {

	public List<PeopleMobile> findByForenames(String forenames);
	
	public List<PeopleMobile> findBySurname(String surname);
	
	public List<PeopleMobile> findByForenamesAndSurname(String forenames, String surname);
	
	public List<PeopleMobile> findByPhoneNumber(String phoneNumber);
}
