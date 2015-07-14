package com.model;

public class AbstractVehicle implements Vehicle{
	private Engine engine;
	
	public AbstractVehicle(Engine engine){
		this.engine = engine;
	}

	public int getPrice() {
		return 1000;
	}

	public Engine getEngine() {
		return engine;
	}
}
