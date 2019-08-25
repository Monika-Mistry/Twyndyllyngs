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

	@Override
	public String getForenames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setForenames(String forenames) {
		this.forenames = forenames;		
	}


	@Override
	public void setSurname(String surname) {
		this.surname = surname;		
	}

	@Override
	public void setAddress(String address) {
		this.address = address;		
	}

}
