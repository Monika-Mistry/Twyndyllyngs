package com.bae.vehicle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ANPRCamera {
	
	@Id
	@Column(name = "anprpointid")
	private Long anprPointId;
	@Column(name = "streetname")
	private String streetName;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;
	
	public Long getAnprPointId() {
		return anprPointId;
	}
	public void setAnprPointId(Long anprPointId) {
		this.anprPointId = anprPointId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
}
