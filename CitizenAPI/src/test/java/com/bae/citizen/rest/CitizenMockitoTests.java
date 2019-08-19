package com.bae.citizen.rest;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.citizen.domain.Citizen;
import com.bae.citizen.service.CitizenService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CitizenMockitoTests {

	@InjectMocks
	CitizenController controller;

	@Mock
	CitizenService service;

	private static final Citizen MOCK_CITIZEN_1 = new Citizen(12345L, "Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ",
			LocalDate.of(1990, 01, 01), "Aardvarktown", "Male");
	private static final Citizen MOCK_CITIZEN_2 = new Citizen(56325L, "Aaron", "Androgenous",
			"256 Megaroad Megatown M6 7RQ", LocalDate.of(1990, 01, 01), "Androgenouston", "Male");

	@Test
	public void getTwoCitizensByForenamesTest() {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(MOCK_CITIZEN_1);
		MOCK_LIST.add(MOCK_CITIZEN_2);

		Mockito.when(service.findByForenames("Aaron")).thenReturn(MOCK_LIST);

		assertEquals(MOCK_LIST, controller.findCitizensByForenames("Aaron"));
		Mockito.verify(service).findByForenames("Aaron");
	}

	@Test
	public void getCitizensByForenamesNotExistTest() {

	}

}
