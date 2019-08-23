package com.bae.mobile.service;

import com.bae.mobile.domain.PeopleMobile;

public interface PeopleMobileService {

	PeopleMobile[] findByForenames(String forenames);
	PeopleMobile[] findBySurname(String surname);
	PeopleMobile[] findByForenamesAndSurname(String forenames, String surname);
	PeopleMobile[] findByPhoneNumber(String phoneNumber);
	
	
}
