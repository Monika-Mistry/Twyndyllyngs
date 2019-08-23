package com.bae;

import java.sql.Timestamp;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.vehicle.domain.VehicleLocations;
import com.bae.vehicle.domain.VehicleRegistration;


public class TestConstants {
	
	public static final VehicleRegistration MOCK_VEHICLE_REGISTRATION_1 = new VehicleRegistration(
			10L,
			LocalDate.of(2001,1,1),
			"CRA 55Y",
			"bike",
			"scooter",
			"pink", 
			"Crazy", 
			"Ivan",
			"543 Crazy Street, Crazy Town, CR 4ZY",
			LocalDate.of(1990,1,1),
			"CRAZY1"
			);
	
	public static final VehicleRegistration MOCK_VEHICLE_REGISTRATION_2 = new VehicleRegistration(
			9L,
			LocalDate.of(2004,1,1),
			"CRA 55Y",
			"bike",
			"scooter",
			"green", 
			"John", 
			"Ivan",
			"544 Crazy Street, Crazy Town, CR 4ZY",
			LocalDate.of(1990,1,1),
			"JOHN22"
			);

	public static final VehicleRegistration[] MOCK_VEHICLE_REGISTRATION_1_ARRAY = {MOCK_VEHICLE_REGISTRATION_1};

	public static final ResponseEntity<VehicleRegistration[]> MOCK_VEHICLE_REGISTRATION_RESPONSE = new ResponseEntity<VehicleRegistration[]>(MOCK_VEHICLE_REGISTRATION_1_ARRAY, HttpStatus.OK);

	public static final VehicleLocations MOCK_VEHICLE_LOCATIONS_1 = new VehicleLocations(
			1L,
			222L,
			Timestamp.valueOf("2015-11-12 23:11:11"),
			"CRA 55Y",
			"Crazy Street",
			12.666666,
			-12.666666
			);
	
	public static final VehicleLocations[] MOCK_VEHICLE_LOCATIONS_1_ARRAY = {MOCK_VEHICLE_LOCATIONS_1};
	
	public static final ResponseEntity<VehicleLocations[]> MOCK_VEHICLE_LOCATIONS_RESPONSE = new ResponseEntity<VehicleLocations[]>(MOCK_VEHICLE_LOCATIONS_1_ARRAY, HttpStatus.OK);

	
}
