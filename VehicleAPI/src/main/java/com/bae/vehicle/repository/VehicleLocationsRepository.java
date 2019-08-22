package com.bae.vehicle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bae.vehicle.domain.VehicleLocations;

public interface VehicleLocationsRepository extends CrudRepository<VehicleLocations, Long>{
	
	public List<VehicleLocations> findByVehicleRegistrationNo(String vehicleRegistrationNo);

}
