package com.bae;

import java.sql.Timestamp;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.domain.CarObject;
import com.bae.domain.Citizen;
import com.bae.domain.VehicleLocations;
import com.bae.domain.VehicleRegistration;

public class TestConstants {

	//Citizen Controller Test
	public static final Citizen MOCK_CITIZEN = new Citizen(12348L, "Crazy", "Ivan",
			"543 Crazy Street, Crazy Town, CR 4ZY", LocalDate.of(1990, 01, 01), "Russiatown", "Male");

	public static final String CITIZEN_FORENAME = "http://citizen:8003/getCitizensByForenames/Crazy";
	public static final String CITIZEN_SURNAME = "http://citizen:8003/getCitizensBySurname/Ivan";
	public static final String CITIZEN_FULLNAME = "http://citizen:8003/getCitizensByFullname/Crazy/Ivan";

	public static final Citizen[] MOCK_CITIZEN_ARRAY = { MOCK_CITIZEN };

	public static final ResponseEntity<Citizen[]> MOCK_CITIZEN_RESPONSE = new ResponseEntity<Citizen[]>(
			MOCK_CITIZEN_ARRAY, HttpStatus.OK);

	//Car Controller Test
	public static final String VEHICLE_LOCATION = "http://vehicle:8004/getLocationsByRegistrationNo/CRA 55Y";
	public static final String VEHICLE_REGISTRATION = "http://vehicle:8004/getVehiclesByRegistrationNo/CRA 55Y";
	
	public static final VehicleLocations[] MOCK_VEHICLE_LOCATION = { new VehicleLocations(2L, 10L,
			new Timestamp(System.currentTimeMillis()), "CRA 55Y", "Crazy Street", 0.00000, 0.000000) };
	public static final ResponseEntity<VehicleLocations[]> MOCK_CAR_LOCATION_RESPONSE = new ResponseEntity<VehicleLocations[]>(MOCK_VEHICLE_LOCATION, HttpStatus.OK);
	
	public static final VehicleRegistration[] MOCK_VEHICLE_REGISTRATION = {
			new VehicleRegistration(10L, LocalDate.of(2001, 01, 01), "CRA 55Y", "bike", "scooter", "pink", "Crazy",
					"Ivan", "543 Crazy Street, Crazy Town, CR 4ZY", LocalDate.of(1990, 01, 01), "CRAZY1") };
	public static final ResponseEntity<VehicleRegistration[]> MOCK_CAR_REG_RESPONSE = new ResponseEntity<VehicleRegistration[]>(MOCK_VEHICLE_REGISTRATION, HttpStatus.OK);
	
}
