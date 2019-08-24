package com.example.associate;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.associate.domain.Associates;

public class TestConstants {
	
	public static final Associates MOCK_ASSOCIATES_1 = new Associates(
			1L,
			"Aaron",
			"Smith",
			LocalDate.of(1990,11,12), 
			"Jim", 
			"White",
			LocalDate.of(1990,04,10)
			);
	
	public static final Associates MOCK_ASSOCIATES_2 = new Associates(
			1L,
			"Aaron",
			"Smith",
			LocalDate.of(1990,11,12), 
			"Nathan", 
			"Stone",
			LocalDate.of(1991,02,01)
			);
	
	public static final Associates[] MOCK_ASSOCIATES_ARRAY = {MOCK_ASSOCIATES_1, MOCK_ASSOCIATES_2};

	public static final ResponseEntity<Associates[]> MOCK_ASSOCIATES_RESPONSE = new ResponseEntity<Associates[]>(MOCK_ASSOCIATES_ARRAY, HttpStatus.OK);
	
}
