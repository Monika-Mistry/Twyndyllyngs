package com.bae.associate.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Associates {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "forenames")
	private String forenames;
	@Column(name = "surname")
	private String surname;
	@Column(name = "dateofbirth")
	private LocalDate dateOfBirth;
	@Column(name = "associateforenames")
	private String associateForenames;
	@Column(name = "associatesurname")
	private String associateSurname;
	@Column(name = "associatedateofbirth")
	private LocalDate associateDateOfBirth;

	public Associates() {
	}

	public Associates(Long id, String forenames, String surname, LocalDate dateOfBirth, String associateForenames,
			String associateSurname, LocalDate associateDateOfBirth) {
		super();
		this.id = id;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.associateForenames = associateForenames;
		this.associateSurname = associateSurname;
		this.associateDateOfBirth = associateDateOfBirth;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAssociateForenames() {
		return associateForenames;
	}

	public void setAssociateForenames(String associateForenames) {
		this.associateForenames = associateForenames;
	}

	public String getAssociateSurname() {
		return associateSurname;
	}

	public void setAssociateSurname(String associateSurname) {
		this.associateSurname = associateSurname;
	}

	public LocalDate getAssociateDateOfBirth() {
		return associateDateOfBirth;
	}

	public void setAssociateDateOfBirth(LocalDate associateDateOfBirth) {
		this.associateDateOfBirth = associateDateOfBirth;
	}

}
