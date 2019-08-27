package com.bae.domain;

import java.time.LocalDate;

public class Citizen {

	private Long citizenId;

	private String forenames;

	private String surname;

	private String homeAddress;

	private LocalDate dateOfBirth;

	private String placeOfBirth;

	private String sex;
	
	
	public Citizen() {
		
	}
	
	
	
	public Citizen(Long citizenId, String forenames, String surname, String homeAddress, LocalDate dateOfBirth,
			String placeOfBirth, String sex) {
		super();
		this.citizenId = citizenId;
		this.forenames = forenames;
		this.surname = surname;
		this.homeAddress = homeAddress;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.sex = sex;
	}



	public Long getCitizenId() {
		return citizenId;
	}
	
	public void setCitizenId(Long citizenId) {
		this.citizenId = citizenId;
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
	
	public String getHomeAddress() {
		return homeAddress;
	}
	
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
