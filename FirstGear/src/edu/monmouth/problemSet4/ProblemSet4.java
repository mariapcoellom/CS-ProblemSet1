package edu.monmouth.problemSet4;

import edu.monmouth.campusvehicle.CampusVehicle;
import edu.monmouth.campusvehicle.CampusVehicleConstants;
import edu.monmouth.campusvehicle.Color;
import java.util.Arrays;


public class ProblemSet4 {
	public static void main(String[] args) {
		CampusVehicle[] vehicles = new CampusVehicle[CampusVehicleConstants.VEHICLE_ARRAY_SIZE];
	
		CampusVehicle campusVehicle1 = new CampusVehicle("mu1001ub", "University Bluffs", true, Color.BLACK);
		CampusVehicle campusVehicle2 = new CampusVehicle("mu1001lib", "Library", true, Color.GREEN);
		CampusVehicle campusVehicle3 = new CampusVehicle("mu1001pl", "Parking Lot", true, Color.BLUE);
		CampusVehicle campusVehicle4 = new CampusVehicle("mu1001lh", "Laurel Hall", true, Color.WHITE);
		CampusVehicle campusVehicle5 = new CampusVehicle("mu1001sh", "Spruce Hall", true, Color.BLACK);
		CampusVehicle campusVehicle6 = new CampusVehicle("mu1002lib", "Library", true, Color.YELLOW);
		CampusVehicle campusVehicle7 = new CampusVehicle("mu1002pl", "Parking Lot", true, Color.BLACK);
		CampusVehicle campusVehicle8 = new CampusVehicle("mu1002sh", "Spruce Hall", true, Color.BLUE);
		CampusVehicle campusVehicle9 = new CampusVehicle("mu101", "University Bluffs", true, Color.BLACK);
		CampusVehicle campusVehicle10 = new CampusVehicle("mu1003pl", "Campus Police", true, Color.BLACK);

		vehicles[0] = campusVehicle1;
		vehicles[1] = campusVehicle2;
		vehicles[2] = campusVehicle3;
		vehicles[3] = campusVehicle4;
		vehicles[4] = campusVehicle5;
		vehicles[5] = campusVehicle6;
		vehicles[6] = campusVehicle7;
		vehicles[7] = campusVehicle8;
		vehicles[8] = campusVehicle9;
		vehicles[9] = campusVehicle10;
		
		for (CampusVehicle vehicle : vehicles) {
			System.out.println("ID: " + vehicle.getId());
			System.out.println("Location: " + vehicle.getLocation());
			System.out.println("Available: " + vehicle.isAvailable());
			System.out.println("Color: " + vehicle.getColor());
			System.out.println();
		
		}
		System.out.println("\nVehicles at Library:");
		
		for (CampusVehicle vehicle : vehicles) {
			if (vehicle.getLocation().equalsIgnoreCase("Library")) {
				System.out.println("ID: " + vehicle.getId());
				System.out.println("Location: " + vehicle.getLocation());
				System.out.println("Available: " + vehicle.isAvailable());
				System.out.println("Color: " + vehicle.getColor());
				System.out.println();
			}
		}
		
		
		System.out.println("\nInitially Available Vehicles:");
			
		for (CampusVehicle vehicle : vehicles) {
			if (vehicle.isAvailable()) {
				System.out.println("ID: " + vehicle.getId());
				System.out.println("Location: " + vehicle.getLocation());
				System.out.println("Available: " + vehicle.isAvailable());
				System.out.println("Color: " + vehicle.getColor());
				System.out.println();
		}
		}
			vehicles[0].setAvailable(false);
			vehicles[3].setAvailable(false);
			vehicles[6].setAvailable(false);
			vehicles[9].setAvailable(false);
			
			System.out.println("\nRemaining Available Vehicles:");
			
			for (CampusVehicle vehicle : vehicles) {
				if (vehicle.isAvailable()) {
					System.out.println("ID: " + vehicle.getId());
					System.out.println("Location: " + vehicle.getLocation());
					System.out.println("Available: " + vehicle.isAvailable());
					System.out.println("Color: " + vehicle.getColor());
					System.out.println();
					
				}
			}

			int count = 0;
			
			for (CampusVehicle vehicle : vehicles) {
				if (vehicle.getLocation().equalsIgnoreCase("University Bluffs")) {
					count ++;
			}
			}
			System.out.println("Vehicles at Univeristy Bluffs: " + count);
			
			CampusVehicle[] universityBluffsVehicles = new CampusVehicle[count];
			int index = 0;
			
			for (CampusVehicle vehicle : vehicles) {
				if (vehicle.getLocation().equalsIgnoreCase("University Bluffs")) {
					universityBluffsVehicles[index] = vehicle;
					index++;
				}
			}
		System.out.println("Number of University Bluffs vehicle: " + universityBluffsVehicles.length);
		
		System.out.println("\nUniversity Bluffs Vehicle:");
		
		for (CampusVehicle vehicle : universityBluffsVehicles) {
				System.out.println("ID: " + vehicle.getId());
				System.out.println("Location: " + vehicle.getLocation());
				System.out.println("Available: " + vehicle.isAvailable());
				System.out.println("Color: " + vehicle.getColor());
				System.out.println();
		}
	
	CampusVehicle[] filledVehicles = new CampusVehicle[5];
	CampusVehicle initializeVehicle = new CampusVehicle();
	Arrays.fill(filledVehicles, initializeVehicle);
	
	
	System.out.println("\nFilled Vehicles:");
	for (CampusVehicle vehicle : filledVehicles) {
		System.out.println("ID: " + vehicle.getId());
		System.out.println("Location: " + vehicle.getLocation());
		System.out.println("Available: " + vehicle.isAvailable());
		System.out.println("Color: " + vehicle.getColor());
		System.out.println();
	}
	}
}
	


				






	
