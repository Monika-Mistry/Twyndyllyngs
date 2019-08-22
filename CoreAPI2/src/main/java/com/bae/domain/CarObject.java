package com.bae.domain;

public class CarObject {
	
	private VehicleLocation[] vehicleLocation;
	private VehicleRegistration[] vehicleRegistration;
	
	public CarObject() {

	}

	public CarObject(VehicleLocation[] vehicleLocation, VehicleRegistration[] vehicleRegistration) {
		super();
		this.vehicleLocation = vehicleLocation;
		this.vehicleRegistration = vehicleRegistration;
	}
	
	public VehicleLocation[] getVehicleLocation() {
		return vehicleLocation;
	}
	public void setVehicleLocation(VehicleLocation[] vehicleLocation) {
		this.vehicleLocation = vehicleLocation;
	}
	public VehicleRegistration[] getVehicleRegistration() {
		return vehicleRegistration;
	}
	public void setVehicleRegistration(VehicleRegistration[] vehicleRegistration) {
		this.vehicleRegistration = vehicleRegistration;
	}
	
	

}
