package com.bae.associate.service;

import java.util.ArrayList;

import com.bae.associate.Associate;

public interface AssociateService {

	ArrayList<Associate> findAssociatesByPhonenumber(String phoneNumber);
	
	ArrayList<Associate> findAssociatesByFullnameAndAddress(String forenames, String surname, String address);

}
