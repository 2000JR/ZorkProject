
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
		Exit e1 = new Exit (Exit.SOUTHWEST, R2F1E1);
		Exit e2 = new Exit (Exit.NORTHWEST, R1F1E1);
		Exit e3 = new Exit (Exit.SOUTHWEST, R3F1E1);
		Exit e4 = new Exit (Exit.SOUTHEAST, R4F1E2);
		Exit e5 = new Exit (Exit.IN, R5F1E2);
		Exit e6 = new Exit (Exit.SOUTHEAST, R6F1E2);
		
		
		R1F1E1.addExit ( e1 );
		R2F1E1.addExit ( e2 );
		R3F1E1.addExit ( e3 );
		R4F1E2.addExit ( e4 );
		R5F1E2.addExit ( e5 );
		R6F1E2.addExit ( e6 );
		//adding it 
		Game.addLocation (R1F1E1);
		Game.addLocation (R2F1E1);
		Game.addLocation (R3F1E1);
		Game.addLocation (R4F1E2);
		
		Game.addExit( e1 );
		Game.addExit( e2 );
		Game.addExit( e3 );
		Game.addExit( e4 );
		Game.addExit( e5 );
		Game.addExit( e6 );

		// Set current location
		Game.setCurrentLocation ( R1F1E1 );
	
	
	
	
	
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