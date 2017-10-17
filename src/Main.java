import java.util.ArrayList;
import java.util.*;
import java.applet.*;
import java.awt.*;

import java.io.*;
class Main
{
	private static final String filename = "SpaceStation.dat";

	// SpaceStation
	private Rooms.Room Main;

	// Game demo constructor
	public Main() throws Exception
	{		
		// Create a file input stream
		final FileInputStream fin = new FileInputStream(filename);

		// Create an object input stream
		final ObjectInputStream objectIn = new ObjectInputStream(fin);

		// Read an object in from object store, and cast it to a SpaceStation
		Main = (Rooms.Room) objectIn.readObject();

		// Set the object stream to standard output		
		Main.setOutputStream ( System.out, 40 );
	}

	public Main(final String args[]) throws Exception
	{
		new Main().play();
	}

	public void play()
	{
		String command = null;
		boolean validCommand = false;

		// Create a data input stream
		final DataInputStream din = new DataInputStream ( System.in );

		for (;;)
		{
			// Show location
			Main.showLocation();

			// Get user input
			try
			{
				command = din.readLine();
				
				// Print a new line
				System.out.println();
			}
			catch (final IOException e)
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
			for (final Enumeration e = Main.getCurrentLocation().getExits().elements(); e.hasMoreElements();)
			{
				final Exit an_exit = (Exit) e.nextElement();

				if ( (an_exit.getDirectionName().compareTo(command) == 0) ||
					 (an_exit.getShortDirectionName().compareTo(command) == 0 )
				   )
				{
					// Set location to the location pointed to by exit
					Main.setCurrentLocation( an_exit.getLeadsTo() );

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
