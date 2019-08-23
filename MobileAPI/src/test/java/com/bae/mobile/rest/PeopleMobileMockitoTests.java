package com.bae.mobile.rest;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.mobile.TestConstants;
import com.bae.mobile.service.PeopleMobileService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeopleMobileMockitoTests {

	
	@InjectMocks
	PeopleMobileController controller;
	
	@Mock
	PeopleMobileService service;

	
	@Test
	public void getMobileDetailsByForenamesTest() {
		Mockito.when(service.findByForenames("Aaron")).thenReturn(TestConstants.MOCK_PERSON_MOBILE_ARRAY);
		
		assertEquals(TestConstants.MOCK_PERSON_MOBILE_RESPONSE, controller.findMobileByForenames("Aaron"));
		Mockito.verify(service).findByForenames("Aaron");
	
	}
	
 	
	@Test
	public void getMobileDetailsBySurnameTest() {
		Mockito.when(service.findBySurname("Aarvark")).thenReturn(TestConstants.MOCK_PEOPLE_MOBILE_ARRAY);
		
		assertEquals(TestConstants.MOCK_PEOPLE_MOBILE_RESPONSE, controller.findMobileBySurname("Aarvark"));
		Mockito.verify(service).findBySurname("Aarvark");
		
	}
	
	@Test
	public void getMobileDetailsByFullname() {
		Mockito.when(service.findByForenamesAndSurname("Aaron", "Aarvark")).thenReturn(TestConstants.MOCK_PERSON_MOBILE_ARRAY);
		
		assertEquals(TestConstants.MOCK_PERSON_MOBILE_RESPONSE, controller.findMobileByFullname("Aaron", "Aarvark"));
		Mockito.verify(service).findByForenamesAndSurname("Aaron", "Aarvark");
	}
	

//	@Test
//	public void getMobileDetailsByFullnameAndDOBTest() {
//		Mockito.when(service.findByForenamesAndSurnameAndDateOfBirth("Aaron", "Aarvark", LocalDate.of(1978, 5, 01))).thenReturn(TestConstants.MOCK_PERSON_MOBILE_ARRAY);
//		
//		assertEquals(TestConstants.MOCK_PERSON_MOBILE_RESPONSE, controller.findMobileByFullnameAndDOB("Aaron", "Aarvark", LocalDate.of(1978, 5, 01)));
//		Mockito.verify(service).findByForenamesAndSurnameAndDateOfBirth("Aaron", "Aarvark", LocalDate.of(1978, 5, 01));
//	}
	
	@Test
	public void getMobileDetailsByPhoneNumberTest() {
		Mockito.when(service.findByPhoneNumber("01234567890")).thenReturn(TestConstants.MOCK_PERSON_MOBILE_ARRAY);
		
		assertEquals(TestConstants.MOCK_PERSON_MOBILE_RESPONSE, controller.findMobilebyPhoneNumber("01234567890"));
		Mockito.verify(service).findByPhoneNumber("01234567890");
	}
	

	 
	
}
