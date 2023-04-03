package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane() {
		// TODO Auto-generated constructor stub
	}
	
	public CargoPlane(String model, String name, double speed, int range, long price) {
		super(model, name, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading Cargo.");
	}
	


}
