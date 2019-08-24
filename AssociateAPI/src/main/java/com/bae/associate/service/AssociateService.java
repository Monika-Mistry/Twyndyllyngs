package com.bae.associate.service;

import com.bae.associate.domain.Associates;

public interface AssociateService {

//	List<Associates> findByDateOfBirth(LocalDate dateOfBirth);

	Associates[] findByForenamesAndSurname(String forenames, String surname);

}
