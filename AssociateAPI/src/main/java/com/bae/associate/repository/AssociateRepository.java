package com.bae.associate.repository;

import org.springframework.data.repository.CrudRepository;

import com.bae.associate.domain.Associates;

public interface AssociateRepository extends CrudRepository<Associates, Long> {

//	public Associates[] findByDateOfBirth(LocalDate dateOfBirth);

	public Associates[] findByForenamesAndSurname(String forenames, String surname);

}
