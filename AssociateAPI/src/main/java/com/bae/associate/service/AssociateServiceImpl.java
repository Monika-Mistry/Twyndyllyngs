package com.bae.associate.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.associate.domain.Associate;
import com.bae.associate.repository.AssociateRepository;

@Service
public class AssociateServiceImpl implements AssociateService {

	private AssociateRepository associateRepository;

	public AssociateServiceImpl() {

	}

	@Autowired
	public AssociateServiceImpl(AssociateRepository associateRepository) {
		this.associateRepository = associateRepository;
	}


	public ArrayList<Associate> findAssociatesByPhonenumber(String phoneNumber) {
		return associateRepository.findAssociatesByPhonenumber(phoneNumber);
	}

	public ArrayList<Associate> findAssociatesByFullnameAndAddress(String forenames, String surname, String address) {
		return associateRepository.findAssociatesByFullnameAndAddress(forenames, surname, address);
	}



}
