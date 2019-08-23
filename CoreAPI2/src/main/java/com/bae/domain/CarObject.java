package com.bae.domain;

public class CarObject {
	
	private VehicleLocations[] vehicleLocation;
	private VehicleRegistration[] vehicleRegistration;
	
	public CarObject() {

	}

	public CarObject(VehicleLocations[] vehicleLocation, VehicleRegistration[] vehicleRegistration) {
		super();
		this.vehicleLocation = vehicleLocation;
		this.vehicleRegistration = vehicleRegistration;
	}
	
	public VehicleLocations[] getVehicleLocation() {
		return vehicleLocation;
	}
	public void setVehicleLocation(VehicleLocations[] vehicleLocation) {
		this.vehicleLocation = vehicleLocation;
	}
	public VehicleRegistration[] getVehicleRegistration() {
		return vehicleRegistration;
	}
	public void setVehicleRegistration(VehicleRegistration[] vehicleRegistration) {
		this.vehicleRegistration = vehicleRegistration;
	}
	
	

}
