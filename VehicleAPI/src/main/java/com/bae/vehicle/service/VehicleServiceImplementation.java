package com.bae.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.vehicle.domain.VehicleLocations;
import com.bae.vehicle.domain.VehicleRegistration;
import com.bae.vehicle.repository.VehicleLocationsRepository;
import com.bae.vehicle.repository.VehicleRegistrationRepository;

@Service
public class VehicleServiceImplementation implements VehicleService {

	private VehicleRegistrationRepository vehicleRegistrationRepository;
	private VehicleLocationsRepository vehicleLocationsRepository;
	
	@Autowired
	public VehicleServiceImplementation(VehicleRegistrationRepository vehicleRegistrationRepository,VehicleLocationsRepository vehicleLocationsRepository) {
		this.vehicleRegistrationRepository = vehicleRegistrationRepository;
		this.vehicleLocationsRepository = vehicleLocationsRepository;
	}
	
	
	@Override
	public VehicleRegistration[] findByVehicleRegistrationNo(String vehicleRegistrationNo) {
		List<VehicleRegistration> vehicleRegistrationList = vehicleRegistrationRepository.findByVehicleRegistrationNo(vehicleRegistrationNo);
		return vehicleRegistrationList.toArray(new VehicleRegistration[vehicleRegistrationList.size()]);	
		
	}

	@Override
	public VehicleLocations[] findLocationsByVehicleRegistrationNo(String vehicleRegistrationNo) {
		List<VehicleLocations> vehicleLocationsList = vehicleLocationsRepository.findByVehicleRegistrationNo(vehicleRegistrationNo);
		return vehicleLocationsList.toArray(new VehicleLocations[vehicleLocationsList.size()]);
	}

}
