package com.bae.citizen;

import java.time.LocalDate;

import com.bae.citizen.domain.Citizen;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestConstants {

	public static final Citizen MOCK_CITIZEN_1 = new Citizen(12345L, "Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ",
			LocalDate.of(1990, 01, 01), "Aardvarktown", "Male");

	public static final Citizen MOCK_CITIZEN_2 = new Citizen(56325L, "Aaron", "Androgenous",
			"256 Megaroad Megatown M6 7RQ", LocalDate.of(1990, 01, 01), "Androgenouston", "Male");

	public static final ObjectMapper objectMapper = new ObjectMapper();

}
