import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
public final class Rooms {
private final class SpaceStation {
	// public static final String filename = "SpaceStation.dat"; considering for later
	private static final String filename = "SpaceStation.dat";
	public void main(String args[]) {
		
		SpaceStation game;
		
		game = new SpaceStation();
		
		/* This is where the rooms are added  with locations descriptions */
		
		Room R1F1E1 = new Room ("First room", "You wake up with no recollection of"
				+ " where you are and how you get here you see an exit SouthEast and a few items around you");
		Room R2F1E1 = new Room ("", "Exit SouthWest room before NW");
		Room R3F1E1 = new Room ("","Exit elevator and Room SouthEast");
		Room R4F1E1 = new Room  ("", "Exit SE ");
		Room R5F1E2 = new Room  ("","");
		Room R6F1E2 = new Room	("","");
		// Floor 2
		Room R7F2E1 = new Room ("","");
		Room R8F2E1 = new Room  ("","");
		Room R9F2E1 = new Room  ("","");
		Room R10F2E1 = new Room  ("","");
		// Floor 3
		Room R11F3E1 = new Room  ("","");
		Room R12F3E1 = new Room  ("","");
		Room R13F3E1 = new Room  ("","");
		Room R14F3E1 = new Room  ("","");
		Room R15F3E1 = new Room  ("","");
		Room R16F3E1M0 = new Room ("Maze","");
		// adding more rooms to maze soon
		// Floor 4
		Room R17F4E1 = new Room ("","");
		Room R18F4E1 = new Room ("","");
		Room R19F4E1 = new Room ("","");
		Room R20F4E1 = new Room ("","");
		
		
		
		
		// Exits
		Exit e1 = new Exit (Exit.SOUTHWEST, R2F1E1);
		Exit e2 = new Exit (Exit.NORTHWEST, R1F1E1);
		Exit e3 = new Exit (Exit.SOUTHWEST, R3F1E1);
		Exit e5 = new Exit (Exit.IN, R5F1E2);
		Exit e4 = new Exit (Exit.SOUTHEAST, R5F1E2);
		Exit e6 = new Exit (Exit.SOUTHEAST, R6F1E2);
		
		//Items
		Items dummy = new Items("dummy"," Test item", true, 1, 21);
		
		// Adding rooms 
		game.addLocation (R1F1E1);
		//Adding exits
		game.addExit(e1);
	}

	private void addExit(Exit e1) {
		// TODO Auto-generated method stub
		
	}

	private void addLocation(Room r1f1e1) {
		// TODO Auto-generated method stub
		
	}
}
class Room {
    public Room(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void setOutputStream(PrintStream out, int i) {
		// TODO Auto-generated method stub
		
	}

	public void showLocation() {
		// TODO Auto-generated method stub
		
	}

	public Location getCurrentLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCurrentLocation(Location leadsTo) {
		// TODO Auto-generated method stub
		
	}

	
}
}