package com.bae.associate.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.associate.service.AssociateService;
import com.example.associate.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssociateMockitoTests {

	@InjectMocks
	AssociateController controller;
	
	@Mock 
	AssociateService service;
	
	@Test
	public void getAssociatesByPhoneNumberTest() {
		Mockito.when(service.findAssociatesByPhonenumber("07700 049488")).thenReturn(TestConstants.MOCK_ASSOCIATES_ARRAY);

		assertEquals(TestConstants.MOCK_ASSOCIATES_ARRAY, controller.findAssociatesByPhonenumber("07700 049488"));
		Mockito.verify(service).findAssociatesByPhonenumber("07700 049488");
	}
	
	@Test
	public void getAssociatesByFullnameAndAddressTest() {
		Mockito.when(service.findAssociatesByFullnameAndAddress("Sarah", "White", "19 HIGH ROAD, UPFORD, U43 7DX")).thenReturn(TestConstants.MOCK_ASSOCIATES_ARRAY);

		assertEquals(TestConstants.MOCK_ASSOCIATES_ARRAY, controller.findAssociatesByFullnameAndAddress("Sarah", "White", "19 HIGH ROAD, UPFORD, U43 7DX"));
		Mockito.verify(service).findAssociatesByFullnameAndAddress("Sarah", "White", "19 HIGH ROAD, UPFORD, U43 7DX");
	}
		
	
}
