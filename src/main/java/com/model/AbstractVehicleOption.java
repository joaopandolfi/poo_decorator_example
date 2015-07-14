package com.model;

public abstract class AbstractVehicleOption extends AbstractVehicle {
	protected Vehicle decoratedVehicle;
	
	public AbstractVehicleOption(Vehicle vehicle){
		super(vehicle.getEngine());
		decoratedVehicle = vehicle;
	}
}
