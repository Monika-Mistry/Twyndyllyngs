package com.bae.associate.service;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.associate.TestConstants;
import com.bae.associate.repository.AssociateRepository;

@RunWith(SpringRunner.class)
public class AssociateServiceTest {

	@InjectMocks
	private AssociateServiceImpl service;

	@Mock
	private AssociateRepository repository;

	@BeforeClass
	public static void setup() {
		TestConstants.MOCK_ASSOCIATES_ARRAY.add(TestConstants.MOCK_ASSOCIATES_1);
	}

	@Test
	public void findAssociatesByPhoneNumberTest() {
		Mockito.when(repository.findAssociatesByPhonenumber("07700 049488"))
				.thenReturn(TestConstants.MOCK_ASSOCIATES_ARRAY);

		assertEquals(TestConstants.MOCK_ASSOCIATES_ARRAY, service.findAssociatesByPhonenumber("07700 049488"));
		Mockito.verify(repository).findAssociatesByPhonenumber("07700 049488");
	}

	@Test
	public void findAssociatesByFullNameAndAddressTest() {
		Mockito.when(repository.findAssociatesByFullnameAndAddress("John", "Smith", "16 HIGH ROAD, UPFORD, U43 2DX"))
				.thenReturn(TestConstants.MOCK_ASSOCIATES_ARRAY);

		assertEquals(TestConstants.MOCK_ASSOCIATES_ARRAY, service.findAssociatesByFullnameAndAddress("John", "Smith", "16 HIGH ROAD, UPFORD, U43 2DX"));
		Mockito.verify(repository).findAssociatesByFullnameAndAddress("John", "Smith", "16 HIGH ROAD, UPFORD, U43 2DX");
	}

}
