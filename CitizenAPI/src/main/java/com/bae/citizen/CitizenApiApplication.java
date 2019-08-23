package com.bae.citizen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class CitizenApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenApiApplication.class, args);
	}

}
