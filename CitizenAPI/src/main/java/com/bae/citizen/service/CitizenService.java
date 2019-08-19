package com.bae.citizen.service;

import java.util.List;

import com.bae.citizen.domain.Citizen;

public interface CitizenService {

	List<Citizen> findByForenames(String forenames);
	List<Citizen> findBySurname(String surname);
	List<Citizen> findByForenamesAndSurname(String forenames, String surname);
	Citizen findById(Long citizenId);
	
}
