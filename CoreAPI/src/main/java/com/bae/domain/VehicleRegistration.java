package com.bae.domain;

import java.time.LocalDate;


public class VehicleRegistration {
	
	private Long registrationId;
	private LocalDate registrationDate;
	private String vehicleRegistrationNo;
	private String make;
	private String model;
	private String colour;
	private String forenames;
	private String surname;
	private String address;
	private LocalDate dateOfBirth;
	private String driverLicenceId;
	
	
	public VehicleRegistration() {
		super();
	}
	
	public VehicleRegistration(Long registrationId, LocalDate registrationDate, String vehicleRegistrationNo,
			String make, String model, String colour, String forenames, String surname, String address,
			LocalDate dateOfBirth, String driverLicenceId) {
		super();
		this.registrationId = registrationId;
		this.registrationDate = registrationDate;
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.forenames = forenames;
		this.surname = surname;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.driverLicenceId = driverLicenceId;
	}
	
	public Long getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getVehicleRegistrationNo() {
		return vehicleRegistrationNo;
	}
	public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getForenames() {
		return forenames;
	}
	public void setForenames(String forenames) {
		this.forenames = forenames;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDriverLicenceId() {
		return driverLicenceId;
	}
	public void setDriverLicenceId(String driverLicenceId) {
		this.driverLicenceId = driverLicenceId;
	}

}
