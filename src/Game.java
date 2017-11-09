
import java.util.ArrayList;

import java.util.Scanner;



public class Game {
	static StationRooms currentLocation;
	static String command;
	static ArrayList inventory = new ArrayList(); // Haven't used inventory into the room description yet
	
	public static void main(String [] args) {
		// Use your ISPlaying code
		boolean isPlaying = true;
	
	
		//floor 1
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
		StationRooms R16F3E1M0 = new StationRooms ("Maze",""); // Use this to link the room to the maze
		// adding more rooms to maze soon
		// Floor 4
		StationRooms R17F4E1 = new StationRooms ("","");
		StationRooms R18F4E1 = new StationRooms ("","");
		StationRooms R19F4E1 = new StationRooms ("","");
		StationRooms R20F4E1 = new StationRooms ("","");
		// Elevator
		StationRooms E1 = new StationRooms ("","");
		StationRooms E2 = new StationRooms ("","");
		StationRooms E3 = new StationRooms ("","");
		StationRooms E4 = new StationRooms ("","");
		
		
		// Exits for Floor 1
		//Room 1 movement
		Exit R1e1 = new Exit (Exit.SOUTHWEST, R2F1E1);
		//room 2 movement
		Exit R2e1 = new Exit (Exit.NORTHWEST, R1F1E1);
		Exit R2e2 = new Exit (Exit.IN, E1); 
		Exit R2e3 = new Exit (Exit.SOUTHWEST, R3F1E1);
		//room 3 movement 
		Exit R3e1 = new Exit (Exit.SOUTHEAST, R4F1E2);
		Exit R3e2 = new Exit (Exit.SOUTHEAST, R6F1E2);
		// room 4
		Exit R4e1 = new Exit (Exit.SOUTHEAST, R5F1E2);
		//Room 5
		Exit R5e1 = new Exit (Exit.NORTHWEST, R4F1E2);
		Exit R5e2 = new Exit (Exit.SOUTHWEST, R6F1E2);
		//Room 6
		Exit R6e1 = new Exit (Exit.IN, R8F2E1);
		Exit R6e2 = new Exit (Exit.NORTHEAST, R5F1E2);
		
		// Exits for Floor 2
		// Room 7
		Exit R7e1 = new Exit (Exit.SOUTHEAST, R8F2E1);
		Exit R7e2 = new Exit (Exit.IN, E2);
		// Room 8
		Exit R8e1 = new Exit (Exit.NORTHEAST, R9F2E1);
		Exit R8e2 = new Exit (Exit.IN, R2F1E1);
		Exit R8e3 = new Exit (Exit.NORTHWEST, R7F2E1);
		// Room 9
		Exit R9e1 = new Exit (Exit.SOUTHWEST, R8F2E1);
		Exit R9e2 = new Exit (Exit.EAST, R10F2E1);
		// Room 10
		Exit R10e1 = new Exit (Exit.WEST, R9F2E1);
		Exit R10e2 = new Exit (Exit.IN, R14F3E1);
		// Exits for floor 3
		
		// Room 11
		Exit R11e1 = new Exit (Exit.EAST, R12F3E1);
		// Room 12 
		Exit R12e1 = new Exit (Exit.EAST, R13F3E1);
		Exit R12e2 = new Exit (Exit.IN, R17F4E1);
		Exit R12e3 = new Exit (Exit.WEST, R11F3E1);
		// Room 13
		Exit R13e1 = new Exit (Exit.EAST, R14F3E1);
		Exit R13e2 = new Exit (Exit.WEST, R12F3E1);
		// Room 14
		Exit R14e1 = new Exit (Exit.EAST, R16F3E1M0);
		Exit R14e2 = new Exit (Exit.WEST, R13F3E1);
		Exit R14e3 = new Exit (Exit.SOUTH, R15F3E1);
		// Room 15
		Exit R15e1 = new Exit (Exit.EAST, R16F3E1M0);
		Exit R15e2 = new Exit (Exit.WEST, R13F3E1);
		Exit R15e3 = new Exit (Exit.NORTH, R14F3E1); 
		//MAZE (PlaceHolder)
		Exit R16e1 = new Exit (Exit.IN, R10F2E1);
		Exit R16e2 = new Exit (Exit.WEST, R14F3E1);
		//Exits Floor 4
		
		// R17
		Exit R17e1 = new Exit (Exit.EAST, R18F4E1);
		Exit R17e2 = new Exit (Exit.IN, E4);
		// R18
		Exit R18e1 = new Exit (Exit.EAST, R19F4E1);
		Exit R18e2 = new Exit (Exit.WEST, R17F4E1);
		// R19
		Exit R19e2 = new Exit (Exit.EAST, R20F4E1);
		Exit R19e1 = new Exit (Exit.WEST, R18F4E1);
		
		// R20
		Exit R20e1 = new Exit (Exit.WEST, R19F4E1);
		//Exit e7 = new Exit (Exit.);
		// Elevator going up
		Exit EE1toE2 = new Exit (Exit.UP, E2);
		Exit EE2toE3 = new Exit (Exit.UP, E3);
		Exit EE3toE4 = new Exit (Exit.UP, E4);
		// Elevator going down
		Exit EE4toE3 = new Exit (Exit.DOWN, E3);
		Exit EE3toE2 = new Exit (Exit.DOWN, E2);
		Exit EE2toE1 = new Exit (Exit.DOWN, E1);
		// Leaving the Elevator
		Exit EE1OUT = new Exit (Exit.OUT, R2F1E1);
		Exit EE2OUT = new Exit (Exit.OUT, R7F2E1);
		Exit EE3OUT = new Exit (Exit.OUT, R12F3E1);
		Exit EE4OUT = new Exit (Exit.OUT, R17F4E1);
		// adding Exits to the rooms 
		R1F1E1.addExit ( R1e1 );
		R2F1E1.addExit ( R2e1 );
		R2F1E1.addExit ( R2e2 );
		R2F1E1.addExit ( R2e3 );
		R3F1E1.addExit ( R3e1 );
		R3F1E1.addExit ( R3e2 );
		R4F1E2.addExit ( R4e1 );
		R5F1E2.addExit ( R5e1 );
		R5F1E2.addExit ( R5e2 );
		R6F1E2.addExit ( R6e1 );
		R6F1E2.addExit ( R6e2 );
		R7F2E1.addExit ( R7e1 );
		R7F2E1.addExit ( R7e2 );
		R8F2E1.addExit ( R8e1 );
		R8F2E1.addExit ( R8e2 );
		R8F2E1.addExit ( R8e3 );
		R9F2E1.addExit ( R9e1 );
		R9F2E1.addExit ( R9e2 );
		R10F2E1.addExit ( R10e1 );
		R10F2E1.addExit ( R10e2 );
		R11F3E1.addExit ( R11e1 );
		R12F3E1.addExit ( R12e1 );
		R12F3E1.addExit ( R12e2 );
		R12F3E1.addExit ( R12e3 );
		R13F3E1.addExit ( R13e1 );
		R13F3E1.addExit ( R13e2 );
		R14F3E1.addExit ( R14e1 );
		R14F3E1.addExit ( R14e2 );
		R14F3E1.addExit (R14e3);
		R15F3E1.addExit ( R15e1 );
		R15F3E1.addExit ( R15e2 );
		R15F3E1.addExit(R15e2);
		R16F3E1M0.addExit ( R16e1 );
		R17F4E1.addExit ( R16e2 );
		R17F4E1.addExit ( R17e1 );
		R17F4E1.addExit ( R17e2 );
		R18F4E1.addExit ( R18e1 );
		R18F4E1.addExit ( R18e2 );
		R19F4E1.addExit ( R19e1 );
		R19F4E1.addExit ( R19e2 );
		R20F4E1.addExit ( R20e1 );
		E1.addExit(EE1toE2);
		E1.addExit(EE1OUT);
		E2.addExit(EE2toE3);
		E2.addExit(EE2toE1);
		E2.addExit(EE2OUT);
		E3.addExit(EE3toE4 );
		E3.addExit(EE3toE2);
		E3.addExit(EE3OUT);
		E4.addExit(EE4toE3);
		E4.addExit(EE4OUT);
		//adding The Rooms into Game 
		Game.addLocation(R1F1E1);
		Game.addLocation(R2F1E1);
		Game.addLocation(R3F1E1);
		Game.addLocation(R4F1E2);
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
		Game.addLocation(E1);
		Game.addLocation(E2);
		Game.addLocation(E3);
		Game.addLocation(E4);
		
		
		//ROOM 1
		Game.addExit( R1e1 );
		//ROOM 2
		Game.addExit( R2e1 );
		Game.addExit( R2e2 );
		Game.addExit( R2e3 );
		//ROOM 3
		Game.addExit( R3e1 );
		Game.addExit( R3e2 );
		//r4
		Game.addExit( R4e1 );
		
		//r5
		Game.addExit( R5e1 );
		Game.addExit( R5e2 );
		//r6
		Game.addExit( R6e1 );
		Game.addExit( R6e2 );
		//r7
		Game.addExit( R7e1 );
		Game.addExit( R7e2 );
		//r8
		Game.addExit( R8e1 );
		Game.addExit( R8e2 );
		Game.addExit( R8e3 );
		//r9
		Game.addExit( R9e1 );
		Game.addExit( R9e2 );
		//r10
		Game.addExit( R10e1 );
		Game.addExit( R10e2 );
		//r11
		Game.addExit( R11e1 );
		
		//r12
		Game.addExit( R12e1 );
		Game.addExit( R12e2 );
		//r13
		Game.addExit( R13e1 );
		Game.addExit( R13e2 );
		//r14
		Game.addExit( R14e1 );
		Game.addExit( R14e2 );
		Game.addExit( R14e3 );
		//r15
		Game.addExit( R15e1 );
		Game.addExit( R15e2 );
		Game.addExit( R15e3 );
		//r16
		Game.addExit( R16e1 );
		Game.addExit( R16e2 );
		//r17
		Game.addExit( R17e1 );
		Game.addExit( R17e2 );
		//r18
		Game.addExit( R18e1 );
		Game.addExit( R18e2 );
		//r19
		Game.addExit( R19e1 );
		Game.addExit( R19e2 );
		//r20
		Game.addExit( R20e1 );
		//E1
		Game.addExit(EE1OUT);
		Game.addExit(EE1toE2);
		//E2
		Game.addExit(EE2OUT);
		Game.addExit(EE2toE1);
		Game.addExit(EE2toE3);
		//E3
		Game.addExit(EE3OUT);
		Game.addExit(EE3toE2);
		Game.addExit(EE3toE4);
		//E4
		Game.addExit(EE4OUT);
		Game.addExit(EE4toE3);
		// Set current location
		Game.setCurrentLocation ( R1F1E1 );
	
		// The stuff Below You can use your showLocation and Current Location Code
	
		//showlnglocation();
	}
/*public static void showlnglocation() {
	System.out.println(currentlocation.getRoomName());
	System.out.println(currentlocation.getRoomLngDesc());
	
	
}
**/
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