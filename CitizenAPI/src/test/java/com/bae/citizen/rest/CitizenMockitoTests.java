package com.bae.citizen.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.citizen.TestConstants;
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

		Mockito.when(service.findByForenames("Aaron")).thenReturn(TestConstants.MOCK_CITIZENS_ARRAY);

		assertEquals(TestConstants.MOCK_CITIZENS_RESPONSE, controller.findCitizensByForenames("Aaron"));
		Mockito.verify(service).findByForenames("Aaron");
	}

	@Test
	public void getCitizensBySurnameTest() {
		Mockito.when(service.findBySurname("Aarvark")).thenReturn(TestConstants.MOCK_CITIZEN_1_ARRAY);

		assertEquals(TestConstants.MOCK_CITIZEN_1_RESPONSE, controller.findCitizensBySurname("Aarvark"));
		Mockito.verify(service).findBySurname("Aarvark");
	}

	@Test
	public void getCitizensByFullnameTest() {

		Mockito.when(service.findByForenamesAndSurname("Aaron", "Aarvark")).thenReturn(TestConstants.MOCK_CITIZEN_1_ARRAY);

		assertEquals(TestConstants.MOCK_CITIZEN_1_RESPONSE, controller.findCitizensByFullname("Aaron", "Aarvark"));
		Mockito.verify(service).findByForenamesAndSurname("Aaron", "Aarvark");
	}
	
	@Test
	public void getCitizensByFullnameAndAddressTest() {

		Mockito.when(service.findByForenamesAndSurnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ")).thenReturn(TestConstants.MOCK_CITIZEN_1_ARRAY);

		assertEquals(TestConstants.MOCK_CITIZEN_1_RESPONSE, controller.findCitizensByFullname("Aaron", "Aarvark","34 Megaroad Megatown M6 7RQ"));
		Mockito.verify(service).findByForenamesAndSurnameAndAddress("Aaron", "Aarvark","34 Megaroad Megatown M6 7RQ");
	}



}
