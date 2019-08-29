package com.bae.vehicle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.vehicle.domain.VehicleRegistration;

@Repository
public interface VehicleRegistrationRepository extends CrudRepository<VehicleRegistration, Long> {
	
	public List<VehicleRegistration> findByVehicleRegistrationNo(String vehicleRegistrationNo);

	public List<VehicleRegistration> findByForenamesAndSurnameAndAddress(String forenames, String surname, String address);

}
