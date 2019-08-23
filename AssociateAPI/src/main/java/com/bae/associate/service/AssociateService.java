package com.bae.associate.service;

import java.time.LocalDate;
import java.util.List;

import com.bae.associate.domain.Associates;

public interface AssociateService {

	List<Associates> findByDateOfBirth(LocalDate dateOfBirth);

	List<Associates> findByForenamesAndSurname(String forenames, String surname);

}
