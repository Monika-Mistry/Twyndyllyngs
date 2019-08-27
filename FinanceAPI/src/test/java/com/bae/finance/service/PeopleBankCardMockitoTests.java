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
import com.bae.finance.domain.PeopleBankCard;
import com.bae.finance.repository.PeopleBankCardRepository;

@RunWith(SpringRunner.class)
public class PeopleBankCardMockitoTests {

	@InjectMocks
	PeopleBankCardServiceImplementation service;
	
	@Mock
	PeopleBankCardRepository repository;
	

	@Test
	public void getBankCardDetailsByFullnameServiceTest() {
	
		List<PeopleBankCard> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_BANK_ACCOUNT_1);
		
		Mockito.when(repository.findByForenamesAndSurname("Aaron", "Aarvark")).thenReturn(MOCK_LIST);
		assertArrayEquals(TestConstants.MOCK_BANK_ACCOUNT_ARRAY, service.findByForenamesAndSurname("Aaron", "Aarvark"));
		
		Mockito.verify(repository).findByForenamesAndSurname("Aaron", "Aarvark");
	}
	
}
