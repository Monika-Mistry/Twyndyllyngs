package com.bae.citizen.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.citizen.domain.Citizen;

@Repository
public interface CitizenRepository extends CrudRepository<Citizen, Long> {

	public List<Citizen> findByForenames(String forenames);

	public List<Citizen> findBySurname(String surname);

	public List<Citizen> findByForenamesAndSurname(String forenames, String surname);

	public List<Citizen> findByForenamesAndSurnameAndHomeAddress(String forenames, String surname, String address);
	
}
