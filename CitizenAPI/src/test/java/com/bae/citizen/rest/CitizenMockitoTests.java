package com.bae.citizen.rest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.citizen.TestConstants;
import com.bae.citizen.domain.Citizen;
import com.bae.citizen.service.CitizenService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CitizenMockitoTests {

	@InjectMocks
	CitizenController controller;

	@Mock
	CitizenService service;

	@Test
	public void getTwoCitizensByForenamesTest() {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_1);
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_2);

		Mockito.when(service.findByForenames("Aaron")).thenReturn(MOCK_LIST);

		assertEquals(MOCK_LIST, controller.findCitizensByForenames("Aaron"));
		Mockito.verify(service).findByForenames("Aaron");
	}

	@Test
	public void getCitizensBySurnameTest() {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_1);
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_2);

		List<Citizen> MOCK_RETURN_LIST = new ArrayList<>();
		MOCK_RETURN_LIST.add(TestConstants.MOCK_CITIZEN_1);

		Mockito.when(service.findBySurname("Aarvark")).thenReturn(MOCK_RETURN_LIST);

		assertEquals(MOCK_RETURN_LIST, controller.findCitizensBySurname("Aarvark"));
		Mockito.verify(service).findBySurname("Aarvark");
	}

	@Test
	public void getCitizensByFullnameTest() {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_1);
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_2);

		List<Citizen> MOCK_RETURN_LIST = new ArrayList<>();
		MOCK_RETURN_LIST.add(TestConstants.MOCK_CITIZEN_1);

		Mockito.when(service.findByForenamesAndSurname("Aaron", "Aarvark")).thenReturn(MOCK_RETURN_LIST);

		assertEquals(MOCK_RETURN_LIST, controller.findCitizensByFullname("Aaron", "Aarvark"));
		Mockito.verify(service).findByForenamesAndSurname("Aaron", "Aarvark");
	}

	@Test
	public void getCitizenByIdDoesExistTest() {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_1);
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_2);

		Mockito.when(service.findById(12345L)).thenReturn(TestConstants.MOCK_CITIZEN_1);

		assertEquals(TestConstants.MOCK_CITIZEN_1, controller.findCitizenById(12345L));
		Mockito.verify(service).findById(12345L);
	}

}
