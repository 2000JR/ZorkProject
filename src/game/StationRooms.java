package game;

public final class StationRooms {
	 
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
			
		}	

	}

