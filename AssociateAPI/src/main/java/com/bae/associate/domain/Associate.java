package com.bae.associate.domain;

public interface Associate {

	String getForenames();
	String getSurname();
	String getAddress();
	
	void setForenames(String fornames);
	void setSurname(String surname);
	void setAddress(String address);
}
