package com.bae.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class VehicleApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(VehicleApiApplication.class, args);
	}

}
