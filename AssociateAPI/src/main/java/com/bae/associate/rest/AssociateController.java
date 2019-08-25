package com.bae.associate.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.associate.Associate;
import com.bae.associate.service.AssociateService;

@RestController
public class AssociateController {

	private AssociateService associateService;

	public AssociateController() {
	}

	@Autowired
	public AssociateController(AssociateService associateService) {
		this.associateService = associateService;
	}

	@GetMapping("/getAssociatesByPhonenumber/{phoneNumber}")
	public ArrayList<Associate> findAssociatesByPhonenumber(
			@PathVariable("phoneNumber") String phoneNumber) {
		return associateService.findAssociatesByPhonenumber(phoneNumber);
	}

//	@GetMapping("/getAssociateByFullname/{forenames}/{surname}")
//	public Associates[] findAssociateByFullname(@PathVariable("forenames") String forenames,
//			@PathVariable("surname") String surname) {
//		return associateService.findByForenamesAndSurname(forenames, surname);
//	}
}
