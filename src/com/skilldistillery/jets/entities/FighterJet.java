package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet() {
		// TODO Auto-generated constructor stub
	}
	
	public FighterJet(String model, String name, double speed, int range, long price) {
		super(model, name, speed, range, price);
	}

	@Override
	public void fight() {
		System.out.println("Make love not war.");
		
	}

}
