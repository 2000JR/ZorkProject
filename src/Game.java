
import java.util.ArrayList;

import java.util.Scanner;



public class Game {
	static StationRooms currentLocation;
	static String command;
	static ArrayList inventory = new ArrayList();
	
	public static void main(String [] args) {
		
		boolean isPlaying = true;
	
	
	
		StationRooms R1F1E1 = new StationRooms ("First StationRooms", "You wake up with no recollection of"
				+ " where you are and how you get here you see an exit SouthEast and a few items around you");
		StationRooms R2F1E1 = new StationRooms ("", "Exit SouthWest StationRooms before NW");
		StationRooms R3F1E1 = new StationRooms ("","Exit elevator and StationRooms SouthEast");
		StationRooms R4F1E2 = new StationRooms  ("", "Exit SE ");
		StationRooms R5F1E2 = new StationRooms  ("","Exit NW, SE");
		StationRooms R6F1E2 = new StationRooms	("","");
		// Floor 2
		StationRooms R7F2E1 = new StationRooms ("","");
		StationRooms R8F2E1 = new StationRooms  ("","");
		StationRooms R9F2E1 = new StationRooms  ("","");
		StationRooms R10F2E1 = new StationRooms  ("","");
		// Floor 3
		StationRooms R11F3E1 = new StationRooms  ("","");
		StationRooms R12F3E1 = new StationRooms  ("","");
		StationRooms R13F3E1 = new StationRooms  ("","");
		StationRooms R14F3E1 = new StationRooms  ("","");
		StationRooms R15F3E1 = new StationRooms  ("","");
		StationRooms R16F3E1M0 = new StationRooms ("Maze","");
		// adding more rooms to maze soon
		// Floor 4
		StationRooms R17F4E1 = new StationRooms ("","");
		StationRooms R18F4E1 = new StationRooms ("","");
		StationRooms R19F4E1 = new StationRooms ("","");
		StationRooms R20F4E1 = new StationRooms ("","");
		
		
		
		
		// Exits
		//Room 1 movement
		Exit R1e1 = new Exit (Exit.SOUTHWEST, R2F1E1);
		//room 2 movement
		Exit R2e2 = new Exit (Exit.NORTHWEST, R1F1E1);
		Exit R2e3 = new Exit (Exit.SOUTHWEST, R3F1E1);
		//room 3 movement R3e5 is elevator exit
		Exit R3e4 = new Exit (Exit.SOUTHEAST, R4F1E2);
		Exit R3e5 = new Exit (Exit.IN, R5F1E2);
		Exit R3e6 = new Exit (Exit.SOUTHEAST, R6F1E2);
		//room 4
		//Exit e7 = new Exit (Exit.);
		
		R1F1E1.addExit ( 	R1e1 );
		R2F1E1.addExit ( R2e2 );
		R3F1E1.addExit ( R2e3 );
		R4F1E2.addExit ( R3e4 );
		R5F1E2.addExit ( R3e5 );
		R6F1E2.addExit ( R3e6 );
		//adding it 
		Game.addLocation (R1F1E1);
		Game.addLocation (R2F1E1);
		Game.addLocation (R3F1E1);
		Game.addLocation (R4F1E2);
		Game.addLocation(R5F1E2);
		Game.addLocation(R6F1E2);
		Game.addLocation(R7F2E1);
		Game.addLocation(R8F2E1);
		Game.addLocation(R9F2E1);
		Game.addLocation(R9F2E1);
		Game.addLocation(R10F2E1);
		Game.addLocation(R11F3E1);
		Game.addLocation(R12F3E1);
		Game.addLocation(R12F3E1);
		Game.addLocation(R13F3E1);
		Game.addLocation(R14F3E1);
		Game.addLocation(R15F3E1);
		Game.addLocation(R16F3E1M0);
		Game.addLocation(R17F4E1);
		Game.addLocation(R18F4E1);
		Game.addLocation(R19F4E1);
		Game.addLocation(R20F4E1);
		
		Game.addExit( R1e1 );
		Game.addExit( R2e2 );
		Game.addExit( R2e3 );
		Game.addExit( R3e4 );
		Game.addExit( R3e5 );
		Game.addExit( R3e6 );

		// Set current location
		Game.setCurrentLocation ( R1F1E1 );
	
	
		showlnglocation();
	}
}
public static void showlnglocation() {
	System.out.println(currentlocation.getRoomName());
	System.out.println(currentlocation.getRoomLngDesc());
	
	
}

	private static void setCurrentLocation(StationRooms r1f1e1) {
		// TODO Auto-generated method stub
		
	}

	private static void addExit(Exit e) {
		// TODO Auto-generated method stub
		
	}

	private static void addLocation(StationRooms r2f1e1) {
		// TODO Auto-generated method stub
		
	}
}