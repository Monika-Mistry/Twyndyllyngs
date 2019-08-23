package com.bae.associate.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bae.associate.domain.Associates;

public interface AssociateRepository extends CrudRepository<Associates, Long> {

	public List<Associates> findByDateOfBirth(LocalDate dateOfBirth);

	public List<Associates> findByForenamesAndSurname(String forenames, String surname);

}
