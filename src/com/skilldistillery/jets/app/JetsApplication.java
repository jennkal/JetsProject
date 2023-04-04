package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetImpl;

public class JetsApplication {
	private AirField airField = new AirField();

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.run();

	}

	public void run() {
		// create the Airfield

		menu();
	}

	public void menu() {

		int input = 0;
		while (input != 9) {
			Scanner kb = new Scanner(System.in);

			System.out.println("------------MENU------------");
			System.out.println("-1:List of Jet Fleet--------");
			System.out.println("-2: Fly all Jets Weeeee-----");
			System.out.println("-3: Fastest Jet-------------");
			System.out.println("-4: Jet with longest Range--");
			System.out.println("-5: Load all Cargo Jets-----");
			System.out.println("-6: Dogfight!!!!!-----------");
			System.out.println("-7: Add a Jet to the Fleet--");
			System.out.println("-8: Remove a Jet from Fleet-");
			System.out.println("-9: Quit -------------------");

			System.out.println("Please, enter a number option: ");
			input = kb.nextInt();

			kb.nextLine();

			if (input == 1) {
				for (Jet jet : airField.listOfJets()) {
					System.out.println(jet.toString());
				}
			} else if (input == 2) {
				for (Jet jet : airField.listOfJets()) {
					jet.fly(jet);
				}
			} else if (input == 3) {
				// fastest jet
				Jet fastestJet = new JetImpl();

				for (Jet jet : airField.listOfJets()) {
					if (jet != null) {
						if (jet.getSpeed() >= fastestJet.getSpeed()) {
							fastestJet = jet;
						}
					}
				}
				System.out.println(fastestJet);
			} else if (input == 4) {
				// longest range jet
				Jet longestRangeJet = new JetImpl();

				for (Jet jet : airField.listOfJets()) {
					if (jet != null) {
						if (jet.getRange() >= longestRangeJet.getRange()) {
							longestRangeJet = jet;
						}
					}
				}
				System.out.println(longestRangeJet);
			} else if (input == 5) {
				for (Jet jet : airField.listOfJets()) {
					if (jet.getModel().equals("Cargo")) {
						jet.loadCargo();
					}
				}
			} else if (input == 6) {
				// Dogfight
				for (Jet jet : airField.listOfJets()) {
					if(jet.getModel().equals("Fighter")) {
						jet.fight();
					}
				}

			} else if (input == 7) {
				// allow user to input new jets
				Scanner sc = new Scanner(System.in);

				System.out.print("Please enter a Model for your Jet: ");
				String model = sc.nextLine();

				System.out.print("What is the your Jets Name: ");
				String name = sc.nextLine();

				System.out.print("What is your Jets speed in MPH: ");
				double speed = sc.nextDouble();

				System.out.print("What is your Jets range in miles: ");
				int range = sc.nextInt();

				System.out.println("What is your Jets price: ");
				long price = sc.nextLong();

				kb.nextLine();

				Jet jet = new JetImpl(model, name, speed, range, price);

				airField.addToFleet(jet);

				//sc.close();
			} else if (input == 8) {
				int option = 0;
				// remove form fleet
				while (option != 2) {
					Scanner scan = new Scanner(System.in);

					System.out.println("-----MENU-----");
					System.out.println("-1. Remove Jet by name");
					System.out.println("-2. Quit menu");
					
					System.out.println("Select a number option: ");
					option = scan.nextInt();
					scan.nextLine();
					
					if (option == 1) {
						System.out.println("Remove Jet by name: ");
						String jet = scan.nextLine();

						airField.removeFromFleet(jet);
					}
					//scan.close();
				}
			} else if (input == 9) {
				System.out.println("Toodeloo");
			}

			//kb.close();
		}

	}
}
