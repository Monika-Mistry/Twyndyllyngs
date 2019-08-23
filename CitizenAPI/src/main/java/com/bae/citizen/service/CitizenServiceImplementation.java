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
	

	public Citizen[] findByForenames(String forenames) {

		List<Citizen> citizensList = citizenRepository.findByForenames(forenames);
		
		return citizensList.toArray(new Citizen[citizensList.size()]);
	}


	public Citizen[] findBySurname(String surname) {
		
		List<Citizen> citizensList = citizenRepository.findBySurname(surname);
		
		return citizensList.toArray(new Citizen[citizensList.size()]);
	}

	
	public Citizen[] findByForenamesAndSurname(String forenames, String surname) {
		
		List<Citizen> citizensList = citizenRepository.findByForenamesAndSurname(forenames, surname);
		
		return citizensList.toArray(new Citizen[citizensList.size()]);
	}


	public Citizen findById(Long citizenId) {
		
		return citizenRepository.findById(citizenId).orElse(null);
	}
	

}
