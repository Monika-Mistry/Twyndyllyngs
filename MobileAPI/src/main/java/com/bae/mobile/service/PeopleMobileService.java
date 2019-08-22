package com.bae.mobile.service;

import java.time.LocalDate;

import com.bae.mobile.domain.PeopleMobile;

public interface PeopleMobileService {

	PeopleMobile[] findByForenames(String forenames);
	PeopleMobile[] findBySurname(String surname);
	PeopleMobile[] findByForenamesAndSurname(String forenames, String surname);
	PeopleMobile[] findByForenamesAndSurnameAndDateOfBirth(String forenames, String surname, LocalDate dateOfBirth);
	PeopleMobile[] findByPhoneNumber(String phoneNumber);
	
	
}
