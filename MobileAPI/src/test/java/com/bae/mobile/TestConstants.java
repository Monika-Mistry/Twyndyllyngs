package com.bae.mobile;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.mobile.domain.PeopleMobile;

public class TestConstants {
	
	public static final PeopleMobile MOCK_PERSON_MOBILE_1 = 
			new PeopleMobile(1, "Aaron", "Aarvark", LocalDate.of(1978, 5, 01), "34 Megaroad Megatown M6 7RQ", "01234567890", "Megafone");
	public static final PeopleMobile MOCK_PERSON_MOBILE_2 =
			new PeopleMobile(2, "Angry", "Aarvark", LocalDate.of(1994, 8, 23),"Burrow Lane, Underground Living, R4G3", "08123456781", "UG");
	
	
	public static final PeopleMobile[] MOCK_PERSON_MOBILE_ARRAY = {MOCK_PERSON_MOBILE_1};
	public static final PeopleMobile[] MOCK_PEOPLE_MOBILE_ARRAY = {MOCK_PERSON_MOBILE_1, MOCK_PERSON_MOBILE_2};
	
	
	public static final ResponseEntity<PeopleMobile[]> MOCK_PERSON_MOBILE_RESPONSE = 
			new ResponseEntity<PeopleMobile[]>(MOCK_PERSON_MOBILE_ARRAY, HttpStatus.OK);
	public static final ResponseEntity<PeopleMobile[]> MOCK_PEOPLE_MOBILE_RESPONSE = 
			new ResponseEntity<PeopleMobile[]>(MOCK_PEOPLE_MOBILE_ARRAY, HttpStatus.OK);
			
	

	
}
