package com.bae.citizen;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.citizen.domain.Citizen;


public class TestConstants {

	public static final Citizen MOCK_CITIZEN_1 = new Citizen(12345L, "Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ",
			LocalDate.of(1990, 01, 01), "Aardvarktown", "Male");

	public static final Citizen MOCK_CITIZEN_2 = new Citizen(56325L, "Aaron", "Androgenous",
			"256 Megaroad Megatown M6 7RQ", LocalDate.of(1990, 01, 01), "Androgenouston", "Male");
	
	public static final Citizen[] MOCK_CITIZEN_1_ARRAY = {MOCK_CITIZEN_1};
	public static final Citizen[] MOCK_CITIZENS_ARRAY = {MOCK_CITIZEN_1, MOCK_CITIZEN_2};
	
	public static final ResponseEntity<Citizen[]> MOCK_CITIZENS_RESPONSE = new ResponseEntity<Citizen[]>(MOCK_CITIZENS_ARRAY, HttpStatus.OK);
	public static final ResponseEntity<Citizen[]> MOCK_CITIZEN_1_RESPONSE = new ResponseEntity<Citizen[]>(MOCK_CITIZEN_1_ARRAY, HttpStatus.OK);
	

}
