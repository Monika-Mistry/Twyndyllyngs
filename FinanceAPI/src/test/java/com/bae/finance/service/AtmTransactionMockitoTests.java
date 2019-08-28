package com.bae.finance.service;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.finance.TestConstants;
import com.bae.finance.domain.AtmTransactionLocations;
import com.bae.finance.repository.AtmTransactionLocationsRepository;

@RunWith(SpringRunner.class)
public class AtmTransactionMockitoTests {

	
	@InjectMocks
	AtmTransactionLocationsServiceImplementation service;
	
	@Mock
	AtmTransactionLocationsRepository repository;
	
	@Test
	public void getAtmTransactionsByFullnameAndAddressServiceTest() {
 		
		List<AtmTransactionLocations> MOCK_LIST = new ArrayList<>();		
		MOCK_LIST.add(TestConstants.MOCK_ATM_TRANSACTIONS);
		
		Mockito.when(repository.findATMTransactionsByForenamesAndSurnameAndHomeAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ"))
		.thenReturn(MOCK_LIST);
		
		assertArrayEquals(TestConstants.MOCK_ATM_TRANSACTION_ARRAY, 
				service.findATMTransactionsByFullnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ"));
		
		Mockito.verify(repository).findATMTransactionsByForenamesAndSurnameAndHomeAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ");
		
	}
	
	@Test
	public void getAtmTransactionsByCardNumberServiceTest() {
		
		List<AtmTransactionLocations> MOCK_LIST = new ArrayList<>();		
		MOCK_LIST.add(TestConstants.MOCK_ATM_TRANSACTIONS);
		
		Mockito.when(repository.findByCardNumber("1234567891234567")).thenReturn(MOCK_LIST);
		
		assertArrayEquals(TestConstants.MOCK_ATM_TRANSACTION_ARRAY, service.findByCardNumber("1234567891234567"));
		
		Mockito.verify(repository).findByCardNumber("1234567891234567");
		
	}
	
	
}
