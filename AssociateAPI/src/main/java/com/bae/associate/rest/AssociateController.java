package com.bae.associate.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.associate.domain.Associates;
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

//	@GetMapping("/getAssociateByDOB/{date}")
//	public List<Associates> findAssociateByDateOfBirth(
//			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable("date") LocalDate dateOfBirth) {
//		return associateService.findByDateOfBirth(dateOfBirth);
//	}

	@GetMapping("/getAssociateByFullname/{forenames}/{surname}")
	public List<Associates> findAssociateByFullname(@PathVariable("forenames") String forenames,
			@PathVariable("surname") String surname) {
		return associateService.findByForenamesAndSurname(forenames, surname);
	}
}
