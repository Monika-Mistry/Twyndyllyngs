package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.domain.CarObject;
import com.bae.domain.VehicleLocations;
import com.bae.domain.VehicleRegistration;

@RestController
@RequestMapping("/vehicle")
public class VehicleController extends Controller {

	private RestTemplate restTemplate;
	private JmsTemplate jmsTemplate;

	public VehicleController(JmsTemplate jmsTemplate, @Autowired RestTemplate restTemplate) {
		super(jmsTemplate);
		this.restTemplate = restTemplate;
	}

	@GetMapping("/{vehicleReg}")
	public ResponseEntity<CarObject> getCarDetails(@PathVariable("vehicleReg") String vehicleReg) {

		ResponseEntity<VehicleLocations[]> vehicleLocation = getVehicleLocation(vehicleReg);
		ResponseEntity<VehicleRegistration[]> vehicleRegistration = getVehicleRegistration(vehicleReg);

		CarObject carObject = new CarObject(vehicleLocation.getBody(), vehicleRegistration.getBody());

		return new ResponseEntity<>(carObject, HttpStatus.OK);
	}

	@GetMapping("/getLocationsByRegistrationNo/{vehicleRegistrationNo}")
	public ResponseEntity<VehicleLocations[]> getVehicleLocation(
			@PathVariable("vehicleRegistrationNo") String vehicleReg) {
		return restTemplate.getForEntity(Constants.VEHICLE_LOCATION_URL + vehicleReg, VehicleLocations[].class);

	}

	@GetMapping("/getVehiclesByRegistrationNo/{vehicleRegistrationNo}")
	public ResponseEntity<VehicleRegistration[]> getVehicleRegistration(
			@PathVariable("vehicleRegistrationNo") String vehicleReg) {
		return restTemplate.getForEntity(Constants.VEHICLE_REGISTRATION_URL + vehicleReg, VehicleRegistration[].class);

	}

}
