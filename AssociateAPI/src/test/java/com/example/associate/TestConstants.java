package com.example.associate;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.associate.Associate;
import com.bae.associate.AssociateImpl;

public class TestConstants {
	
	public static final Associate MOCK_ASSOCIATES_1 = new AssociateImpl(
			"John", 
			"Smith", 
			"16 HIGH ROAD, UPFORD, U43 2DX"
			);
	
	public static final Associate MOCK_ASSOCIATES_2 = new AssociateImpl(
			"Ian", 
			"Owen", 
			"23 LOW STREET, UPFORD, U45 1NV"
			);
	
	public static ArrayList<Associate> MOCK_ASSOCIATES_ARRAY = new ArrayList<Associate>();
			
	
	public static final ResponseEntity<ArrayList<Associate>> MOCK_ASSOCIATES_RESPONSE = new ResponseEntity<ArrayList<Associate>>(MOCK_ASSOCIATES_ARRAY, HttpStatus.OK);
	
}
