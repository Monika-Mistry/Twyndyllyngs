package com.bae.associate.service;

import java.util.ArrayList;

import com.bae.associate.Associate;

public interface AssociateService {

	ArrayList<Associate> findAssociatesByPhonenumber(String phoneNumber);

//	Associates[] findByForenamesAndSurname(String forenames, String surname);

}
