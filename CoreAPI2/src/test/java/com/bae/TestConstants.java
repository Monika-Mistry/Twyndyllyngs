package com.bae;

import java.sql.Timestamp;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.domain.CarObject;
import com.bae.domain.Citizen;
import com.bae.domain.VehicleLocation;
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
	
	public static final VehicleLocation[] MOCK_VEHICLE_LOCATION = { new VehicleLocation(2L, 10L,
			new Timestamp(System.currentTimeMillis()), "CRA 55Y", "Crazy Street", 0.00000, 0.000000) };
	
	public static final VehicleRegistration[] MOCK_VEHICLE_REGISTRATION = {
			new VehicleRegistration(10L, LocalDate.of(2001, 01, 01), "CRA 55Y", "bike", "scooter", "pink", "Crazy",
					"Ivan", "543 Crazy Street, Crazy Town, CR 4ZY", LocalDate.of(1990, 01, 01), "CRAZY1") };
	
	public static final CarObject MOCK_CAR_OBJECT = new CarObject(MOCK_VEHICLE_LOCATION, MOCK_VEHICLE_REGISTRATION);

	public static final ResponseEntity<CarObject> MOCK_CAR_RESPONSE = new ResponseEntity<CarObject>(MOCK_CAR_OBJECT, HttpStatus.OK);
	public static final ResponseEntity<VehicleLocation[]> MOCK_CAR_LOCATION_RESPONSE = new ResponseEntity<VehicleLocation[]>(MOCK_VEHICLE_LOCATION, HttpStatus.OK);
	public static final ResponseEntity<VehicleRegistration[]> MOCK_CAR_REG_RESPONSE = new ResponseEntity<VehicleRegistration[]>(MOCK_VEHICLE_REGISTRATION, HttpStatus.OK);
}
