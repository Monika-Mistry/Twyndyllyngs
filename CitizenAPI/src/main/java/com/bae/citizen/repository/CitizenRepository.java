package com.bae.citizen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bae.citizen.domain.Citizen;


public interface CitizenRepository extends JpaRepository<Citizen, Long> {

	public List<Citizen> findByForenames(String forenames);
	
	public List<Citizen> findBySurname(String surname);
	
	public List<Citizen> findByForenamesAndSurname(String forenames, String surname);
	
}
