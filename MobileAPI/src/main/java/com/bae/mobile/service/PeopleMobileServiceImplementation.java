package com.bae.mobile.service;

import java.sql.Date;
import java.time.LocalDate;
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

	public PeopleMobile[] findByForenamesAndSurnameAndDateOfBirth(String forenames, String surname,
			LocalDate dateOfBirth) {

		List<PeopleMobile> peopleMobileList = peopleMobileRepository.findByForenamesAndSurnameAndDateOfBirth(forenames,
				surname, dateOfBirth);

		return peopleMobileList.toArray(new PeopleMobile[peopleMobileList.size()]);

	}

	public PeopleMobile[] findByPhoneNumber(String phoneNumber) {
		
		List<PeopleMobile> peopleMobileList = peopleMobileRepository.findByPhoneNumber(phoneNumber);

		return peopleMobileList.toArray(new PeopleMobile[peopleMobileList.size()]);
	}

}
