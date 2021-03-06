package com.bae.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.mobile.domain.PeopleMobile;
import com.bae.mobile.repository.PeopleMobileRepository;

@Service
public class PeopleMobileServiceImplementation implements PeopleMobileService {

	private PeopleMobileRepository peopleMobileRepository;

	@Autowired
	public PeopleMobileServiceImplementation(PeopleMobileRepository peopleMobileRepository) {

		this.peopleMobileRepository = peopleMobileRepository;
	}

	public PeopleMobile[] findByForenames(String forenames) {

		List<PeopleMobile> peopleMobileList = peopleMobileRepository.findByForenames(forenames);

		return peopleMobileList.toArray(new PeopleMobile[peopleMobileList.size()]);

	}
 
	public PeopleMobile[] findBySurname(String surname) {

		List<PeopleMobile> peopleMobileList = peopleMobileRepository.findBySurname(surname);

		return peopleMobileList.toArray(new PeopleMobile[peopleMobileList.size()]);
	}

	public PeopleMobile[] findByForenamesAndSurname(String forenames, String surname) {

		List<PeopleMobile> peopleMobileList = peopleMobileRepository.findByForenamesAndSurname(forenames, surname);

		return peopleMobileList.toArray(new PeopleMobile[peopleMobileList.size()]);
	}


	public PeopleMobile[] findByPhoneNumber(String phoneNumber) {
		
		List<PeopleMobile> peopleMobileList = peopleMobileRepository.findByPhoneNumber(phoneNumber);

		return peopleMobileList.toArray(new PeopleMobile[peopleMobileList.size()]);
	}

	@Override
	public PeopleMobile[] findByForenamesAndSurnameAndAddress(String forenames, String surname, String address) {
		List<PeopleMobile> peopleMobileList = peopleMobileRepository.findByForenamesAndSurnameAndAddress(forenames, surname, address);

		return peopleMobileList.toArray(new PeopleMobile[peopleMobileList.size()]);
	}

}
