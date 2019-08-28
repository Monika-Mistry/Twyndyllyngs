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
import com.bae.finance.service.PeopleBankCardService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeopleBankCardMockitoTests {

	@InjectMocks
	PeopleBankCardController controller;
	
	@Mock
	PeopleBankCardService service;
	
	@Test
	public void getBankCardDetailsByFullnameTest() {
		
		Mockito.when(service.findByForenamesAndSurnameAndAddress("Aaron", "Aarvark","34 Megaroad Megatown M6 7RQ")).thenReturn(TestConstants.MOCK_BANK_ACCOUNT_ARRAY);

		assertEquals(TestConstants.MOCK_BANK_ACCOUNT_RESPONSE, controller.findBankAccountDetailsByFullnameAndAddress("Aaron", "Aarvark","34 Megaroad Megatown M6 7RQ"));
		Mockito.verify(service).findByForenamesAndSurnameAndAddress("Aaron", "Aarvark","34 Megaroad Megatown M6 7RQ");
	}
	
	
}
