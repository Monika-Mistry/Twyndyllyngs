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
import com.bae.finance.domain.EposTransactionLocations;
import com.bae.finance.repository.EposTransactionLocationsRepository;

@RunWith(SpringRunner.class)
public class EposTransactionMockitoTests {

	
	@InjectMocks
	EposTransactionLocationsServiceImplementation service;
	
	@Mock
	EposTransactionLocationsRepository repository;
	
	@Test
	public void getEposTransactionsByFullnameAndAddressServiceTest() {
 		
		List<EposTransactionLocations> MOCK_LIST = new ArrayList<>();		
		MOCK_LIST.add(TestConstants.MOCK_EPOS_TRANSACTIONS);
		
		Mockito.when(repository.findByForenamesAndSurnameAndHomeAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ"))
		.thenReturn(MOCK_LIST);
		
		assertArrayEquals(TestConstants.MOCK_EPOS_TRANSACTION_ARRAY, 
				service.findByForenamesAndSurnameAndAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ"));
		
		Mockito.verify(repository).findByForenamesAndSurnameAndHomeAddress("Aaron", "Aarvark", "34 Megaroad Megatown M6 7RQ");
		
	}
	
	@Test
	public void getEposTransactionsByCardNumberServiceTest() {
		
		List<EposTransactionLocations> MOCK_LIST = new ArrayList<>();		
		MOCK_LIST.add(TestConstants.MOCK_EPOS_TRANSACTIONS);
		
		Mockito.when(repository.findByCardNumber("1234567891234567")).thenReturn(MOCK_LIST);
		
		assertArrayEquals(TestConstants.MOCK_EPOS_TRANSACTION_ARRAY, service.findByCardNumber("1234567891234567"));
		
		Mockito.verify(repository).findByCardNumber("1234567891234567");
		
	}
	
}
