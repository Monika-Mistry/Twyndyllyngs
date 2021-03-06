package com.bae.vehicle.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.vehicle.domain.VehicleLocations;
import com.bae.vehicle.domain.VehicleRegistration;
import com.bae.vehicle.service.VehicleService;

@RestController
public class VehicleController {
	
	private VehicleService vehicleService;
	
	@Autowired
	public VehicleController(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	
	
	@GetMapping("/getVehiclesByRegistrationNo/{vehicleRegistrationNo}")
	public ResponseEntity<VehicleRegistration[]> getVehiclesByRegistrationNo(@PathVariable("vehicleRegistrationNo") String vehicleRegistrationNo) {

		return new ResponseEntity<>(vehicleService.findByVehicleRegistrationNo(vehicleRegistrationNo), HttpStatus.OK);
	}
	
	@GetMapping("/getLocationsByRegistrationNo/{vehicleRegistrationNo}")
	public ResponseEntity<VehicleLocations[]> getLocationsByRegistrationNo(@PathVariable("vehicleRegistrationNo") String vehicleRegistrationNo) {

		return new ResponseEntity<>(vehicleService.findLocationsByVehicleRegistrationNo(vehicleRegistrationNo), HttpStatus.OK);
	}
	
	@GetMapping("/findVehicleByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<VehicleRegistration[]> findVehicleByForenameSurnameAddress(@PathVariable("forenames") String forenames, @PathVariable("surname") String surname, @PathVariable("address") String address) {

		return new ResponseEntity<>(vehicleService.findVehicleByForenameSurnameAddress(forenames, surname, address), HttpStatus.OK);
	}

}
