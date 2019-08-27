package com.bae.domain;

public class Associate {
	
	private String forenames;
	
	private String surname;
	
	private String address;
	
	
	public Associate() {
		super();
	}

	public Associate(String forenames, String surname, String address) {
		super();
		this.forenames = forenames;
		this.surname = surname;
		this.address = address;
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
	
	

}
