package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	//talk directly to any jet
	private List<Jet> fleet;
	
	public AirField() {
		//populate its fleet from the file
	}
	
	
	public List<Jet> readFromFile(String fn) {
		List<Jet> jets = new ArrayList<>();
		
		//read in types of jets form file
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
			  String aJet;
			  while ((aJet = bufIn.readLine()) != null) {
				  //as you read in a Jet, create a Jet
			    String[] jetDetails = aJet.split(",");
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
