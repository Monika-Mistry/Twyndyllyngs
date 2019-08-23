package com.bae.vehicle.service;

import com.bae.vehicle.domain.VehicleLocations;
import com.bae.vehicle.domain.VehicleRegistration;

public interface VehicleService {
		
	VehicleRegistration[] findByVehicleRegistrationNo(String vehicleRegistrationNo);
	VehicleLocations[] findLocationsByVehicleRegistrationNo(String vehicleRegistrationNo);
	
}
