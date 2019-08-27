package com.bae.mobile.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CellTower {
	

	@Id
	@Column(name = "id")
	private Long cellTowerId;
	@Column(name = "operator")
	private String operator;
	@Column(name = "type")
	private String type;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;
	
	
	public CellTower() {
		
	}
	
	public CellTower(Long cellTowerId, String operator, String type, Double latitude, Double longitude) {
		this.cellTowerId = cellTowerId;
		this.operator = operator;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	
	
	public Long getCellTowerId() {
		return cellTowerId;
	}

	public void setCellTowerId(Long cellTowerId) {
		this.cellTowerId = cellTowerId;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
