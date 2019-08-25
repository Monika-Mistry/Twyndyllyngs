package com.bae.associate.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.associate.Associate;
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


	@Override
	public ArrayList<Associate> findAssociatesByPhonenumber(String phoneNumber) {
		return associateRepository.findAssociatesByPhonenumber(phoneNumber);
	}


//	public Associates[] findByForenamesAndSurname(String forenames, String surname) {
//		return associateRepository.findByForenamesAndSurname(forenames, surname);
//	}

}
