package com.bae.associate.service;

import com.bae.associate.domain.Associate;

public interface AssociateService {

	Associate[] findAssociatesByPhonenumber(String phoneNumber);
	
	Associate[] findAssociatesByFullNameAndAddress(String forenames, String surname, String address);

}
