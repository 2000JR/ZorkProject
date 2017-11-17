
import java.util.ArrayList;

public class Room {
	private String roomName;
	private String roomDesc;
	private int exit;
	private ArrayList<Items> itemsinRoom;
	
		public Room() {
			roomName="ERROR";
			roomDesc="ERROR";
			
		}
		
		public Room(String n, String ld, int e) {
			roomName=n;
			roomDesc=ld;
			exit=e;
		}
		
		public Room(String n, String ld, int e, Items item) {
			roomName=n;
			roomDesc=ld;
			exit=e;
			itemsinRoom = new ArrayList<Items>();
			this.itemsinRoom.add(item);
			
		}

		public String getRoomName() {
			return roomName;
		}

		public void setRoomName(String roomName) {
			this.roomName = roomName;
		}
		public String getRoomLngDesc() {
			return roomDesc;
		}

		public void setRoomLngDesc(String roomLngDesc) {
			this.roomDesc = roomLngDesc;
		}

		public int getExitnum() {
			return exit;
		}

		public void setExitnum(int exit) {
			this.exit = exit;
		}			
}