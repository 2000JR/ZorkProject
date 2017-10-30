package game;


import java.util.Enumeration;
import java.io.*;


class Game {
		
	private static final String filename = "SpaceStation.dat";
		
		private SpaceStation game;

		
		public Game() throws Exception
		{		
			
			FileInputStream fin = new FileInputStream(filename);
	
			ObjectInputStream objectIn = new ObjectInputStream(fin);

			
			game = (SpaceStation) objectIn.readObject();

			
			game.setOutputStream ( System.out, 40 );
		}

		public static void main(String args[]) throws Exception
		{
			new Game().play();
		}


		public void play()
		{
			String command = null;
			boolean validCommand = false;

			// Create a data input stream
			DataInputStream din = new DataInputStream ( System.in );

			for (;;)
			{
				// Show location
				game.showLocation();

				// Get user input
				try
				{
					command = din.readLine();
					
					// Print a new line
					System.out.println();
				}
				catch (IOException e)
				{
				}

				// By default, we haven't found a valid command
				validCommand = false;

				// Parse user input
				if (command.length() == 0)
				{
					System.out.println ("Huh? Invalid command!");
					continue;
				}

				// Convert to uppercase for comparison
				command = command.toUpperCase();

				// Search for an exit match
				for (Enumeration<?> e = game.getCurrentLocation().getExits().elements(); e.hasMoreElements();)
				{
					Exit an_exit = (Exit) e.nextElement();

					if ( (an_exit.getDirectionName().compareTo(command) == 0) ||
						 (an_exit.getShortDirectionName().compareTo(command) == 0 )
					   )
					{
						// Set location to the location pointed to by exit
						game.setCurrentLocation( an_exit.getLeadsTo() );

						// Valid command encountered
						validCommand = true;

						// No need to search exits anymore
						break;
					}				
				}

				// Check to see if user wants to quit
				if (command.compareTo( "QUIT" ) == 0)
				{
					System.out.println ("Okay. Bye!");
					System.exit(0);
				}

				// If no valid commands, warn the user is invalid
				if (!validCommand)
				{
					System.out.println ("Huh? Invalid direction!");
					System.out.println ();
				}
			}
		}
	}