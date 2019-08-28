package com.bae.associate.service;

import java.util.List;

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


	public Associate[] findAssociatesByPhonenumber(String phoneNumber) {
		
		List<Associate> associateList = associateRepository.findAssociatesByPhonenumber(phoneNumber);
		
		return associateList.toArray(new Associate[associateList.size()]);
	}

	public Associate[] findAssociatesByFullNameAndAddress(String forenames, String surname, String address) {
		
		List<Associate> associateList =  associateRepository.findAssociatesByFullNameAndAddress(forenames, surname, address);
		
		return associateList.toArray(new Associate[associateList.size()]);
	}



}
