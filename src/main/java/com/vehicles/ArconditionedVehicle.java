package com.vehicles;

import com.model.AbstractVehicleOption;
import com.model.Vehicle;

public class ArconditionedVehicle extends AbstractVehicleOption{

	public ArconditionedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	public int getPrice(){
		return decoratedVehicle.getPrice() + 600;
	}
	
	public void setTemperature(int temp){
		
	}
}
