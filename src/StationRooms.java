
import java.util.Vector;
import java.util.*;

public final class StationRooms {
	 
	private String shortDescription;
	private String longDescription;
	private String roomName;
	private Vector roomExits;
	// private ArrayList<Exit> roomExits;
	private ArrayList itemsInRoom;
	private boolean power;
	
	

	public StationRooms() {
		shortDescription = new String();
		longDescription = new String();
		roomName = new String();
		roomExits =new Vector();
		//roomExits = new ArrayList<Exit>();
		itemsInRoom = new ArrayList();
		power = false;
		
	}
	
	public StationRooms(String title) {
		shortDescription = new String();
		longDescription = new String();
		roomName = title;
		roomExits = new Vector();
		//roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	public StationRooms(String title, String SD) {
		shortDescription = SD;
		longDescription = new String();
		roomName = title;
		roomExits = new Vector();
		//roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	public StationRooms(String title, String SD, String LD) {
		shortDescription = SD;
		longDescription = LD;
		roomName = title;
		roomExits = new Vector();
		//roomExits = new ArrayList();
		itemsInRoom = new ArrayList();
		power = false;
	}
	
	public void addExit(Exit exit) {
	roomExits.addElement (exit);
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
/*
	public ArrayList getItemsInRoom() {
		return itemsInRoom;
	}

	public void setItemsInRoom(ArrayList itemsInRoom) {
		this.itemsInRoom = itemsInRoom;
	}
*/
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public Vector getRoomExits() {
		return roomExits;
	}
}

