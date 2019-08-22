package com.bae.mobile.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.mobile.TestConstants;
import com.bae.mobile.service.MobileCallRecordService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MobileCallRecordMockitoTests {

	@InjectMocks
	MobileCallRecordController controller;
	
	@Mock
	MobileCallRecordService service;
	

	//getCallRecordsByReceiverTest
	//getCallRecordsByCallerOrReceiver
	
	@Test
	public void getCallRecordsByCallerTest() {
		Mockito.when(service.findByCaller("01234567890")).thenReturn(TestConstants.MOCK_CALL_RECORD_ARRAY);
		
		assertEquals(TestConstants.MOCK_CALL_RECORD_RESPONSE, controller.findCallRecordsByCaller("01234567890"));
		Mockito.verify(service).findByCaller("01234567890");
	}
	
	
}
