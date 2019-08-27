package com.bae.associate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class AssociateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssociateApiApplication.class, args);
	}

}
