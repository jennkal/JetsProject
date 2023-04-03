package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	//talk directly to any jet
	
	private List<Jet> fleet = readFromFile("jets.txt");
	
	public AirField() {
		//populate its fleet from the file
		
	}
	
	public List<Jet> listOfJets() {
		return this.fleet;
	}
	
	public void addToFleet(Jet jet) {
		fleet.add(jet);
		System.out.println("Jet added to fleet");
	}
	
	public void removeFromFleet(Jet jet) {
		fleet.remove(jet);
		System.out.println("Jet removed from fleet");
	}
	
	public List<Jet> readFromFile(String fn) {
		List<Jet> jets = new ArrayList<>();
		
		//read in types of jets form file
		try ( BufferedReader bufIn = new BufferedReader(new FileReader(fn)) ) {
			  String aJet;
			  while ((aJet = bufIn.readLine()) != null) {
				  //as you read in a Jet, create a Jet
			    String[] jetDetails = aJet.split(",");
			    
			    if (jetDetails[0].equals("Fighter"))
			    {
			    	FighterJet newJet = new FighterJet(jetDetails[0], jetDetails[1], Double.parseDouble(jetDetails[2]), Integer.parseInt(jetDetails[3]), Long.parseLong(jetDetails[4]));
			    	jets.add(newJet);
			    }
			    else if (jetDetails[0].equals("Cargo"))
			    {
			    	CargoPlane newJet = new CargoPlane(jetDetails[0], jetDetails[1], Double.parseDouble(jetDetails[2]), Integer.parseInt(jetDetails[3]), Long.parseLong(jetDetails[4]));
			    	jets.add(newJet);
			    }
			    else
			    {
			    	JetImpl newJet = new JetImpl(jetDetails[0], jetDetails[1], Double.parseDouble(jetDetails[2]), Integer.parseInt(jetDetails[3]), Long.parseLong(jetDetails[4]));
			    	jets.add(newJet);
			    }
			    
			    //create the appropriate jet based on all
			    //the jet details
			    
			    
			    // if the jetDetails[0] happens to be a DCV, then create a DilithiumPowered jet
			    // if the jetDetails[0] happens to be a fighter, then create a fighter jet
			    
			    //and add that specific jet type to your jets list

				  
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		//and add that specific Jet type to your jets list
		
		return jets;
	}
	
}
