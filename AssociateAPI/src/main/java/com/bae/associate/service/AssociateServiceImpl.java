package com.bae.associate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.associate.domain.Associates;
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

//	public Associates[] findByDateOfBirth(LocalDate dateOfBirth) {
//		return associateRepository.findByDateOfBirth(dateOfBirth);
//	}

	public Associates[] findByForenamesAndSurname(String forenames, String surname) {
		return associateRepository.findByForenamesAndSurname(forenames, surname);
	}

}
