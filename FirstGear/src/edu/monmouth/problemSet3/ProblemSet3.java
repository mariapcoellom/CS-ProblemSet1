package edu.monmouth.problemSet3;

import edu.monmouth.campusvehicle.Color;

import edu.monmouth.campusvehicle.CampusVehicle;


public class ProblemSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CampusVehicle automobile1 = new CampusVehicle();
		System.out.println("ID: " + automobile1.getId());
		System.out.println("Location: " + automobile1.getLocation());
		System.out.println("Available: " + automobile1.isAvailable());
		System.out.println("Color: " + automobile1.getColor());
		
		automobile1.setId("MU1555");
		automobile1.setLocation("Library");
		automobile1.setAvailable(false);
		automobile1.setColor(Color.BLUE);
		
		System.out.println("ID: " + automobile1.getId());
		System.out.println("Location: " + automobile1.getLocation());
		System.out.println("Available: " + automobile1.isAvailable());
		System.out.println("Color: " + automobile1.getColor());
		
		CampusVehicle automobile2 = new CampusVehicle("MU2467", "Parking Lot", true, Color.RED);
		System.out.println("ID: " + automobile2.getId());
		System.out.println("Location: " + automobile2.getLocation());
		System.out.println("Available: " + automobile2.isAvailable());
		System.out.println("Color: " + automobile2.getColor());
		
		automobile2.setColor(Color.GREEN);
		System.out.println("ID: " + automobile2.getId());
		System.out.println("Location: " + automobile2.getLocation());
		System.out.println("Available: " + automobile2.isAvailable());
		System.out.println("Color: " + automobile2.getColor());
		
		CampusVehicle automobile3 = new CampusVehicle("MU888", "Soccer Field", true, Color.WHITE);
		System.out.println("ID: " + automobile3.getId());
		System.out.println("Location: " + automobile3.getLocation());
		System.out.println("Available: " + automobile3.isAvailable());
		System.out.println("Color: " + automobile3.getColor());
	
		CampusVehicle automobile4 = new CampusVehicle("MU1717", "Airport", true, Color.RED);
		System.out.println("ID: " + automobile4.getId());
		System.out.println("Location: " + automobile4.getLocation());
		System.out.println("Available: " + automobile4.isAvailable());
		System.out.println("Color: " + automobile4.getColor());
		
		CampusVehicle automobile5 = new CampusVehicle("MU1987", "Library", true, null);
		System.out.println("ID: " + automobile5.getId());
		System.out.println("Location: " + automobile5.getLocation());
		System.out.println("Available: " + automobile5.isAvailable());
		System.out.println("Color: " + automobile5.getColor());
		
		

	}

}
