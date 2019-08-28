package com.bae.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.TestConstants;
import com.bae.domain.AtmTransactionLocations;
import com.bae.domain.EposTransactionLocations;
import com.bae.domain.PeopleBankCard;

@RunWith(SpringRunner.class)
public class FinanceControllerTest {
	
	@InjectMocks
	private FinanceController controller;

	@Mock
	private RestTemplate restTemplate;
	
	@Test
	public void findATMTransactionsByFullnameAndAddressTest() {

		doReturn(TestConstants.MOCK_ATM_TRANSACTION_RESPONSE).when(restTemplate).getForEntity(TestConstants.ATM_TRANSACTIONS_FULLNAME_AND_ADDRESS,
				AtmTransactionLocations[].class);

		assertEquals(TestConstants.MOCK_ATM_TRANSACTION_RESPONSE, controller.findATMTransactionsByFullnameAndAddress(
				"Aaron", 
				"Aarvark", 
				"34 Megaroad Megatown M6 7RQ"));

		verify(restTemplate).getForEntity(TestConstants.ATM_TRANSACTIONS_FULLNAME_AND_ADDRESS, AtmTransactionLocations[].class);

	}
	
	@Test
	public void findATMTransactionsByCardNumberTest() {

		doReturn(TestConstants.MOCK_ATM_TRANSACTION_RESPONSE).when(restTemplate).getForEntity(TestConstants.ATM_TRANSACTIONS_CARD_NUMBER,
				AtmTransactionLocations[].class);

		assertEquals(TestConstants.MOCK_ATM_TRANSACTION_RESPONSE, controller.findATMTransactionsByCardNumber(
				"1234567891234567"));

		verify(restTemplate).getForEntity(TestConstants.ATM_TRANSACTIONS_CARD_NUMBER, AtmTransactionLocations[].class);

	}
	
	@Test
	public void findEposTransactionsByFullnameAndAddressTest() {

		doReturn(TestConstants.MOCK_EPOS_TRANSACTION_RESPONSE).when(restTemplate).getForEntity(TestConstants.EPOS_TRANSACTIONS_FULLNAME_AND_ADDRESS,
				EposTransactionLocations[].class);

		assertEquals(TestConstants.MOCK_EPOS_TRANSACTION_RESPONSE, controller.findEposTransactionsByFullnameAndAddress(
				"Aaron", 
				"Aarvark", 
				"34 Megaroad Megatown M6 7RQ"));

		verify(restTemplate).getForEntity(TestConstants.EPOS_TRANSACTIONS_FULLNAME_AND_ADDRESS, EposTransactionLocations[].class);

	}
	
	@Test
	public void findEposTransactionsByCardNumberTest() {

		doReturn(TestConstants.MOCK_EPOS_TRANSACTION_RESPONSE).when(restTemplate).getForEntity(TestConstants.EPOS_TRANSACTIONS_CARD_NUMBER,
				EposTransactionLocations[].class);

		assertEquals(TestConstants.MOCK_EPOS_TRANSACTION_RESPONSE, controller.findEposTransactionsByCardNumber(
				"1234567891234567"));

		verify(restTemplate).getForEntity(TestConstants.EPOS_TRANSACTIONS_CARD_NUMBER, EposTransactionLocations[].class);

	}
	
	
	@Test
	public void findBankAccountDetailsByFullnameAndAddressTest() {

		doReturn(TestConstants.MOCK_BANK_ACCOUNT_RESPONSE).when(restTemplate).getForEntity(TestConstants.PEOPLE_BANK_CARD_FULLNAME_AND_ADDRESS,
				PeopleBankCard[].class);

		assertEquals(TestConstants.MOCK_BANK_ACCOUNT_RESPONSE, controller.findBankAccountDetailsByFullnameAndAddress(
				"Aaron", 
				"Aarvark", 
				"34 Megaroad Megatown M6 7RQ"));

		verify(restTemplate).getForEntity(TestConstants.PEOPLE_BANK_CARD_FULLNAME_AND_ADDRESS, PeopleBankCard[].class);

	}
	


}
