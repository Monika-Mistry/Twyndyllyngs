package com.bae.associate;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.associate.domain.Associate;
import com.bae.associate.domain.AssociateImpl;

public class TestConstants {
	
	public static final Associate MOCK_ASSOCIATES_1 = new AssociateImpl(
			"John", 
			"Smith", 
			"16 HIGH ROAD, UPFORD, U43 2DX"
			);

	public static ArrayList<Associate> MOCK_ASSOCIATES_ARRAYLIST = new ArrayList<Associate>();
	
	public static Associate[] MOCK_ASSOCIATES_ARRAY = {MOCK_ASSOCIATES_1};
			
	
	public static final ResponseEntity<Associate[]> MOCK_ASSOCIATES_RESPONSE = new ResponseEntity<Associate[]>(MOCK_ASSOCIATES_ARRAY, HttpStatus.OK);
	
}
