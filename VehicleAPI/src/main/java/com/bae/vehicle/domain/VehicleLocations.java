package com.bae.vehicle.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleLocations {
	
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "anprpointid")
	private Long anprPointId;
	@Column(name = "timestamp")
	private Timestamp timestamp;
	@Column(name = "vehicleregistrationno")
	private String vehicleRegistrationNo;
	@Column(name = "streetname")
	private String streetName;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;
	
	
	public VehicleLocations() {
		super();
	}
	
	public VehicleLocations(Long id, Long anprPointId, Timestamp timestamp, String vehicleRegistrationNo,
			String streetName, Double latitude, Double longitude) {
		super();
		this.id = id;
		this.anprPointId = anprPointId;
		this.timestamp = timestamp;
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAnprPointId() {
		return anprPointId;
	}
	public void setAnprPointId(Long anprPointId) {
		this.anprPointId = anprPointId;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getVehicleRegistrationNo() {
		return vehicleRegistrationNo;
	}
	public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
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
