package edu.monmouth.campusvehicle;

public class CampusVehicleConstants {
	
	public static final int MIN_ID_LENGTH = 6;
	public static final int MAX_ID_LENGTH = 18;
	public static final String DEFAULT_ID ="UNKNOWN";
	public static final String DEFAULT_LOCATION = "UNKNOWN";
	public static final boolean DEFAULT_AVAILABLE = true;
	public static final Color DEFAULT_COLOR = Color.UNKNOWN;
	
	public static final String[] VALID_LOCATIONS = {
			"Library",
			"University Bluffs",
			"Parking Lot",
			"Spruce Hall",
			"Laurel Hall"
	};
	
	public static final int VEHICLE_ARRAY_SIZE = 10;
	
	private CampusVehicleConstants() {
	
	}
	

}
