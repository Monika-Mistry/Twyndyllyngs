package com.bae.associate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.associate.AssociateApiApplication;
import com.bae.associate.rest.AssociateController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AssociateApiApplication.class)
public class AssociateApiApplicationTests {

	@Autowired
	private AssociateController controller;
	
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
