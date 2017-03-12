/**
 * 
 * @author Disha Gupta
 * NYC Open Data Mining Assignment (This program lets the user find the location of specific FDNY firehouse locations. The user enters the name
 * 									of the firehouse they want to find and the program parses through a text file that contains data of all 
 * 									of the firehouse names and locations (retrieved from NYC Open Data) and prints out its location.)
 * 
 */

package edu.nyu.cs.dg2703;

// Import necessary Java packages
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenData {

	public static void main(String[] args) throws FileNotFoundException {

		// DATA: https://nycopendata.socrata.com/Public-Safety/FDNY-Firehouse-Listing/hc8x-tcnd/data
		// Used the FDNY Firehouse Listing Dataset which contains 219 rows of data and 3 columns
		// All rows and columns are being used
		
		// Create a new Scanner with the file as the input
		Scanner input = new Scanner(new File("src/edu/nyu/cs/dg2703/FDNYFirehouseListing.txt"));

		// Create a new Scanner to get user input.
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the FDNY Firehouse Finder App!");
		// Tell the user where the data is from
		System.out.println("This app mines data from: https://nycopendata.socrata.com/Public-Safety/FDNY-Firehouse-Listing/hc8x-tcnd/data");
		// Tell the user what the application does
		System.out.println("This app lets the user enter any NYC firehouse name and displays to them the facility address "
							+ "and the borough of the facility.");
		System.out.println();
		
		// Initialize a two dimensional array that is the length of the text file containing the FDNY firehouse names and locations data
		// The data has 218 rows and 3 columns
		String[][] firehouseListings = new String[218][3];
		
		// Set up an accumulator variable
		int x = 0;
		
		// Check to see if the file has a next line
		// If it does continue parsing through the data
		while (input.hasNextLine()) {
			
			// Get the next line
			String line = input.nextLine();
			
			// Split the line at each comma and assign it to the multidimensional array
			firehouseListings[x] = line.split(",");
			// Increment the accumulator variable 
			x++;
			
		} // while loop
		
		// Ask the user for the station name they want to locate
		System.out.println("Enter the full name of the FDNY Facility you wish to locate (example: 'Engine 6' or 'Engine 4/Ladder 15'): ");
		String stationName = userInput.nextLine();
		System.out.println();
		
		// Loop over all of the rows in the array to search for the users input
		for (int row = 0; row < firehouseListings.length ; row++) {
			// Check to see if the users input is the first value in each row
			// Every first value is the name of the station which is what the user is entering
			if (stationName.equals(firehouseListings[row][0])) {
				System.out.printf("FDNY Station " + stationName + " is located at" + firehouseListings[row][1] 
									+ " in the borough of" + firehouseListings[row][2] + ".");
			}
		}
		System.out.println();
		
		// Close both Scanners
		input.close();
		userInput.close();
		 
	} // main method

} // class
