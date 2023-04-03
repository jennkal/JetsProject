package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
	protected String model;
	protected String name;
	protected double speed;
	protected int range;
	protected long price;
	protected int id;
	protected static int count;
	
	public Jet () {
		
	}
	
	public Jet (String model, String name, double speed, int range, long price) {
		this.model = model;
		this.name = name;
		this.speed = speed;
		this.range = range;
		this.price = price;
		
		count++;
		id = count;
	}
	
	public void fly(Jet jet) {
		//details each jet
		System.out.println("Jet [model: " + jet.model + ", Name: " + jet.name + ", Speed: " + jet.speed + ", Range: " + jet.range + ", Price: " + jet.price);
		//time till run out of fuel = range / speed
		double time = jet.range / jet.speed;
		System.out.println("Amount to time Jet can fly till the Jet runs out of fuel is: " + time + " Hr(s).");
		
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", name=" + name + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
