
public class testcode {
	private String roomName;
	private String roomShrtDesc;
	private String roomLngDesc;
	private int exitnum;
	int[] exitlist=new int[exitnum];

		public void Room() {
			roomName="ERROR";
			roomShrtDesc="ERROR";
			roomLngDesc="ERROR";
		}
		
		public void Room (String n, String sd, String ld, int e) {
			roomName=n;
			roomShrtDesc=sd;
			roomLngDesc=ld;
			exitnum=e;
		}

		public String getRoomName() {
			return roomName;
		}

		public void setRoomName(String roomName) {
			this.roomName = roomName;
		}

		public String getRoomShrtDesc() {
			return roomShrtDesc;
		}

		public void setRoomShrtDesc(String roomShrtDesc) {
			this.roomShrtDesc = roomShrtDesc;
		}

		public String getRoomLngDesc() {
			return roomLngDesc;
		}

		public void setRoomLngDesc(String roomLngDesc) {
			this.roomLngDesc = roomLngDesc;
		}

		public int getExitnum() {
			return exitnum;
		}

		public void setExitnum(int exitnum) {
			this.exitnum = exitnum;

		}
}
