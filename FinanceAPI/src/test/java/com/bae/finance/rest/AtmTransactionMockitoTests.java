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
import com.bae.finance.service.AtmTransactionLocationsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtmTransactionMockitoTests {

	@InjectMocks
	AtmTransactionLocationsController controller;
	
	@Mock
	AtmTransactionLocationsService service;
	
	@Test
	public void getAtmTransactionsByFullnameAndAddressTest() {
		Mockito.when(service.findATMTransactionsByFullnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ")).thenReturn(TestConstants.MOCK_ATM_TRANSACTION_ARRAY);

		assertEquals(TestConstants.MOCK_ATM_TRANSACTION_RESPONSE, controller.findATMTransactionsByFullnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ"));
		Mockito.verify(service).findATMTransactionsByFullnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ");
	}
	
	@Test
	public void getAtmTransactionsByCardNumberTest() {
		Mockito.when(service.findByCardNumber("1234567891234567")).thenReturn(TestConstants.MOCK_ATM_TRANSACTION_ARRAY);
		
		assertEquals(TestConstants.MOCK_ATM_TRANSACTION_RESPONSE, controller.findATMTransactionsByCardNumber("1234567891234567"));
		Mockito.verify(service).findByCardNumber("1234567891234567");
	}
	
	
}
