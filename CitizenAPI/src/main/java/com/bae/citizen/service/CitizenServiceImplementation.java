package com.bae.citizen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.citizen.domain.Citizen;
import com.bae.citizen.repository.CitizenRepository;

@Service
public class CitizenServiceImplementation implements CitizenService{

	
	private CitizenRepository citizenRepository;
	
	@Autowired
	public CitizenServiceImplementation(CitizenRepository citizenRepository) {

		this.citizenRepository = citizenRepository;
	}
	

	public List<Citizen> findByForenames(String forenames) {
		
		return citizenRepository.findByForenames(forenames);
	}


	public List<Citizen> findBySurname(String surname) {
		
		return citizenRepository.findBySurname(surname);
	}

	
	public List<Citizen> findByForenamesAndSurname(String forenames, String surname) {
		
		return citizenRepository.findByForenamesAndSurname(forenames, surname);
	}


	public Citizen findById(Long citizenId) {
		
		return citizenRepository.findById(citizenId).orElse(null);
	}
	

}
