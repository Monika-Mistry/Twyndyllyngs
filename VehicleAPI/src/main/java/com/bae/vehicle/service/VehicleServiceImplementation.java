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
	
	

	public VehicleRegistration[] findByVehicleRegistrationNo(String vehicleRegistrationNo) {
		List<VehicleRegistration> vehicleRegistrationList = vehicleRegistrationRepository.findByVehicleRegistrationNo(vehicleRegistrationNo);
		return vehicleRegistrationList.toArray(new VehicleRegistration[vehicleRegistrationList.size()]);	
		
	}


	public VehicleLocations[] findLocationsByVehicleRegistrationNo(String vehicleRegistrationNo) {
		List<VehicleLocations> vehicleLocationsList = vehicleLocationsRepository.findByVehicleRegistrationNo(vehicleRegistrationNo);
		return vehicleLocationsList.toArray(new VehicleLocations[vehicleLocationsList.size()]);
	}
	
	public VehicleRegistration[] findVehicleByForenameSurnameAddress(String forenames, String surname, String address) {
		List<VehicleRegistration> vehicleRegistrationList = vehicleRegistrationRepository.findByForenamesAndSurnameAndAddress(forenames, surname, address);
		return vehicleRegistrationList.toArray(new VehicleRegistration[vehicleRegistrationList.size()]);
	}

}
