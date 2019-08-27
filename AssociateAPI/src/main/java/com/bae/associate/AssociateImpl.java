package com.bae.associate;

public class AssociateImpl implements Associate {

	private Object forenames;
	private String surname;
	private String address;
	
	public AssociateImpl(Object forenames, String surname, String address) {
		super();
		this.forenames = forenames;
		this.surname = surname;
		this.address = address;
	}


	public String getForenames() {
		return null;
	}


	public String getSurname() {

		return null;
	}


	public String getAddress() {

		return null;
	}

	public void setForenames(String forenames) {
		this.forenames = forenames;		
	}


	public void setSurname(String surname) {
		this.surname = surname;		
	}


	public void setAddress(String address) {
		this.address = address;		
	}

}
