package com.example.associate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.associate.AssociateImpl;

public class TestConstants {
	
	public static final AssociateImpl MOCK_ASSOCIATES_1 = new AssociateImpl(
			"John", 
			"Smith", 
			"16 HIGH ROAD, UPFORD, U43 2DX"
			);
	
	public static final AssociateImpl MOCK_ASSOCIATES_2 = new AssociateImpl(
			"Ian", 
			"Owen", 
			"23 LOW STREET, UPFORD, U45 1NV"
			);
	
	public static final AssociateImpl[] MOCK_ASSOCIATES_ARRAY = {MOCK_ASSOCIATES_1, MOCK_ASSOCIATES_2};

	public static final ResponseEntity<AssociateImpl[]> MOCK_ASSOCIATES_RESPONSE = new ResponseEntity<AssociateImpl[]>(MOCK_ASSOCIATES_ARRAY, HttpStatus.OK);
	
}
