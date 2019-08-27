package com.bae.citizen.service;

import com.bae.citizen.domain.Citizen;

public interface CitizenService {

	Citizen[] findByForenames(String forenames);
	Citizen[] findBySurname(String surname);
	Citizen[] findByForenamesAndSurname(String forenames, String surname);
	Citizen findById(Long citizenId);
	Citizen[] findByForenamesAndSurnameAndAddress(String forenames, String surname, String address);
	
}
