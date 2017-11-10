

import java.util.*;

public final class StationRooms {
	 
	private String shortDescription;
	private String longDescription;
	private String roomName;
	private ArrayList<Exit> roomExits;
	private ArrayList itemsInRoom;
	private boolean power;
	
	

	public StationRooms() {
		shortDescription = new String();
		longDescription = new String();
		roomName = new String();
		roomExits = new ArrayList<Exit>();
		itemsInRoom = new ArrayList();
		power = false;
		
	}
	
	public StationRooms(String title) {
		shortDescription = new String();
		longDescription = new String();
		roomName = title;
		roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	public StationRooms(String title, String shortdescrition) {
		shortDescription = shortDescription;
		longDescription = new String();
		roomName = title;
		roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	public StationRooms(String title, String shortdescrition, String longdescription) {
		shortDescription = shortDescription;
		longDescription = longDescription;
		roomName = title;
		roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	public void addExit(Exit exit) {
	roomExits.add(exit);
	}
	public void removeExit(Exit exit) {
		if(roomExits.contains(exit)) {
			roomExits.remove(exit);
		}
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public ArrayList getItemsInRoom() {
		return itemsInRoom;
	}

	public void setItemsInRoom(ArrayList itemsInRoom) {
		this.itemsInRoom = itemsInRoom;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public ArrayList getRoomExits() {
		return roomExits;
	}
	
/*	private static final Object game = null;
	public static String filename = "SpaceStation.dat";


		public StationRooms(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String args[])
		{
			// SpaceStation
			SpaceStation game;
		
			// Create a new instance of a SpaceStation
			game = new SpaceStation();

			/* This is where the rooms are added  with locations descriptions */
			/*
			StationRooms R1F1E1 = new StationRooms ("First StationRooms", "You wake up with no recollection of"
					+ " where you are and how you get here you see an exit SouthEast and a few items around you");
			StationRooms R2F1E1 = new StationRooms ("", "Exit SouthWest StationRooms before NW");
			StationRooms R3F1E1 = new StationRooms ("","Exit elevator and StationRooms SouthEast");
			StationRooms R4F1E2 = new StationRooms  ("", "Exit SE ");
			StationRooms R5F1E2 = new StationRooms  ("","Exit NW, SE");
			StationRooms R6F1E2 = new StationRooms	("","");
			
			
			
			
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
			game.addLocation (R1F1E1);
			game.addLocation (R2F1E1);
			game.addLocation (R3F1E1);
			game.addLocation (R4F1E2);
			
			game.addExit( e1 );
			game.addExit( e2 );
			game.addExit( e3 );
			game.addExit( e4 );
			game.addExit( e5 );
			game.addExit( e6 );

			// Set current location
			game.setCurrentLocation ( R1F1E1 );
			
		}

		private void addExit(Exit e2) {
			// TODO Auto-generated method stub
				
		try
		{
			// Create a file to write game system
			FileOutputStream out = new FileOutputStream (filename);

			// Create an object output stream, linked to out
			ObjectOutputStream objectOut = new ObjectOutputStream (out);

			// Write game system to object store
			objectOut.writeObject (game);

			// Close object output stream
			objectOut.close();

			System.out.println ("Game data created as " + filename );
		}
		catch (Exception e)
		{
			System.err.println ("Unable to create game data");
		}
		
		} */
}

