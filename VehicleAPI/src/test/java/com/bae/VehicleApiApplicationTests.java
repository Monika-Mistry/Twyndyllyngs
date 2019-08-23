package com.bae;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.vehicle.VehicleApiApplication;
import com.bae.vehicle.rest.VehicleController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VehicleApiApplication.class)
public class VehicleApiApplicationTests {
	
	@Autowired
	private VehicleController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
	

}
