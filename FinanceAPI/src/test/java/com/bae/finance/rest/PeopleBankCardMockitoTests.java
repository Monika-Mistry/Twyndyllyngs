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
		
		Mockito.when(service.findByForenamesAndSurname("Aaron", "Aarvark")).thenReturn(TestConstants.MOCK_BANK_ACCOUNT_ARRAY);

		assertEquals(TestConstants.MOCK_BANK_ACCOUNT_RESPONSE, controller.findBankAccountDetailsByFullname("Aaron", "Aarvark"));
		Mockito.verify(service).findByForenamesAndSurname("Aaron", "Aarvark");
	}
	
	
}
