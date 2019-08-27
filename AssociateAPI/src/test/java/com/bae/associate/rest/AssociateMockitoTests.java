package com.bae.associate.rest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.associate.TestConstants;
import com.bae.associate.service.AssociateService;

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
		Mockito.when(service.findAssociatesByFullNameAndAddress("John", "Smith", "16 HIGH ROAD, UPFORD, U43 2DX")).thenReturn(TestConstants.MOCK_ASSOCIATES_ARRAY);

		assertEquals(TestConstants.MOCK_ASSOCIATES_ARRAY, controller.findAssociatesByFullNameAndAddress("John", "Smith", "16 HIGH ROAD, UPFORD, U43 2DX"));
		Mockito.verify(service).findAssociatesByFullNameAndAddress("John", "Smith", "16 HIGH ROAD, UPFORD, U43 2DX");
	}
		
	
}
