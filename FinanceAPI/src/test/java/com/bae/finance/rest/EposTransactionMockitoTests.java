package com.bae.finance.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.finance.TestConstants;
import com.bae.finance.service.EposTransactionLocationsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EposTransactionMockitoTests {

	
	@InjectMocks
	EposTransactionLocationsController controller;
	
	@Mock
	EposTransactionLocationsService service;
	
	
	@Test
	public void getEposTransactionsByFullnameAndAddressTest() {
		Mockito.when(service.findByForenamesAndSurnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ")).thenReturn(TestConstants.MOCK_EPOS_TRANSACTION_ARRAY);

		assertEquals(TestConstants.MOCK_EPOS_TRANSACTION_RESPONSE, controller.findEposTransactionsByFullnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ"));
		Mockito.verify(service).findByForenamesAndSurnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ");
	}
	
	@Test
	public void getAtmTransactionsByCardNumberTest() {
		Mockito.when(service.findByCardNumber("1234567891234567")).thenReturn(TestConstants.MOCK_EPOS_TRANSACTION_ARRAY);
		
		assertEquals(TestConstants.MOCK_EPOS_TRANSACTION_RESPONSE, controller.findEposTransactionsByCardNumber("1234567891234567"));
		Mockito.verify(service).findByCardNumber("1234567891234567");
	}
	
	
}
