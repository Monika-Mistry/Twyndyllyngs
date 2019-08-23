package com.bae;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.domain.Citizen;

public class TestConstants {
	
	public static final Citizen MOCK_CITIZEN = new Citizen(12348L, "Crazy", "Ivan", "543 Crazy Street, Crazy Town, CR 4ZY", LocalDate.of(1990, 01, 01), "Russiatown", "Male");
	
	public static final String CITIZEN_FORENAME = "http://citizen:8003/getCitizensByForenames/Crazy";
	public static final String CITIZEN_SURNAME = "http://citizen:8003/getCitizensBySurname/Ivan";
	public static final String CITIZEN_FULLNAME = "http://citizen:8003/getCitizensByFullname/Crazy/Ivan";
	
	public static final Citizen[] MOCK_CITIZEN_ARRAY = {MOCK_CITIZEN}; 
	
	public static final ResponseEntity<Citizen[]> MOCK_CITIZEN_RESPONSE = new ResponseEntity<Citizen[]>(MOCK_CITIZEN_ARRAY, HttpStatus.OK);
}
