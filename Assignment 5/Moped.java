/**
 * 
 * @author Disha Gupta
 * Virtual Moped Assignment (This program creates all methods and data fields that the TestDrive file will need to run.)
 * 
 */

package edu.nyu.cs.dg2703;

public class Moped {
	
	// Data Fields
	
	// Set up an int array that keeps track of the mopeds location
	// The moped always starts at 10th St and 5th Ave
	public int[] location = {10,5};
	// The highest street the moped can drive to is 200
	public int streetMax = 200;
	// The highest avenue the moped can drive to is 10
	public int avenueMax = 10;
	// Moped comes prefilled with 1 gallon of gas
	// So the percentage should start with 100
	public int gas = 100;
	// Create a String array to keep track of the mopeds orientation
	public String[] orientation = {"North", "East", "South", "West"};
	// The moped always starts out oriented South
	// So set the current orientation to South to begin
	public String currentOrientation = orientation[2];
	
	/**
	 * Method that turns left
	 * @param none
	 */
	public void goLeft () {
		// Tell the user their current location
		// Make sure to always empty the gas tank by 5%
		// Change the orientation of the moped
		// Set up a statement for each possible orientation the moped could have
		if (currentOrientation.equals("North")) {
			location[1] += 1;
			currentOrientation = orientation[3];
		}
		else if (currentOrientation.equals("South")) {
			location[1] -= 1;
			currentOrientation = orientation[1];
		}
		else if (currentOrientation.equals("East")) {
			location[0] += 1;
			currentOrientation = orientation[0];
		}
		else if (currentOrientation.equals("West")) {
			location[0] -= 1;
			currentOrientation = orientation[2];
		}
		System.out.println("Now at " + location[0] + "th St. and " + location[1] + "th Ave.");
		this.gas -= 5;
	}
	
	/**
	 * Method that turns right
	 * @param none
	 */
	public void goRight () {
		// Tell the user their current location
		// Make sure to always empty the gas tank by 5%
		// Change the orientation of the moped
		// Set up a statement for each possible orientation the moped could have
		if (currentOrientation.equals("North")) {
			location[1] -= 1;
			currentOrientation = orientation[1];
		}
		else if (currentOrientation.equals("South")) {
			location[1] += 1;
			currentOrientation = orientation[3];
		}
		else if (currentOrientation.equals("East")) {
			location[0] -= 1;
			currentOrientation = orientation[2];
		}
		else if (currentOrientation.equals("West")) {
			location[0] += 1;
			currentOrientation = orientation[0];
		}
		System.out.println("Now at " + location[0] + "th St. and " + location[1] + "th Ave.");
		this.gas -= 5;
	}
	
	/**
	 * Method that drives straight
	 * @param none
	 */
	public void straightOn () {
		// Tell the user their current location
		// Make sure to always empty the gas tank by 5%
		// Change the orientation of the moped
		// Set up a statement for each possible orientation the moped could have
		if (currentOrientation.equals("North")) {
			location[0] += 1;
			currentOrientation = orientation[0];
		}
		else if (currentOrientation.equals("South")) {
			location[0] -= 1;
			currentOrientation = orientation[2];
		}
		else if (currentOrientation.equals("East")) {
			location[1] -= 1;
			currentOrientation = orientation[1];
		}
		else if (currentOrientation.equals("West")) {
			location[1] += 1;
			currentOrientation = orientation[3];
		}
		System.out.println("Now at " + location[0] + "th St. and " + location[1] + "th Ave.");
		this.gas -= 5;
	}
	
	/**
	 * Method that drives back
	 * @param none
	 */
	public void backUp () {
		// Tell the user their current location
		// Make sure to always empty the gas tank by 5%
		// Change the orientation of the moped
		// Set up a statement for each possible orientation the moped could have
		if (currentOrientation.equals("North")) {
			location[0] -= 1;
			currentOrientation = orientation[0];
		}
		else if (currentOrientation.equals("South")) {
			location[0] += 1;
			currentOrientation = orientation[2];
		}
		else if (currentOrientation.equals("East")) {
			location[1] += 1;
			currentOrientation = orientation[1];
		}
		else if (currentOrientation.equals("West")) {
			location[1] -= 1;
			currentOrientation = orientation[3];
		}
		System.out.println("Now at " + location[0] + "th St. and " + location[1] + "th Ave.");
		this.gas -= 5;
	}
	
	/**
	 * Method that returns the current value of gas
	 * This can be used to determine the current percentage of gas in the tank and whether or not the moped can continue to drive
	 * @param none
	 * @return int gas variable
	 */
	public int howWeDoin() {
		return this.gas;
	}
	
	/**
	 * Method that fills the gas tank back to 100%
	 * @param none
	 */
	public void fillErUp() {
		this.gas = 100;
	}
	
	/**
	 * Method that drives the moped to the restaurant Petite Abeille one block at a time
	 * @param none
	 */
	public void goToPetiteAbeille() {
		
		// Refill the gas tank so the moped doesn't run out on its way to the restaurant
		this.gas = 100;
		// Tell the user that they're gas is being refilled
		System.out.println("Okay! Your gas tank is being refilled to 100% so you don't run out on your way to the restaurant :)");
		
		// If the street is greater than 16th, start driving South
		// Make sure to update the moped's orientation
		// Tell the user their current location
		// Make sure to always empty the gas tank by 5%
		if (location[0] > 16) {
			while (location[0] != 16) {
				location[0] -= 1;		
				currentOrientation = orientation[2];
				System.out.println("Now at " + location[0] + "th St. and " + location[1] + "th Ave. ... heading South.");
				this.gas -= 5;
			}
		}
		// If the street is less than 16th, start driving North
		// Make sure to update the moped's orientation
		// Tell the user their current location
		// Make sure to always empty the gas tank by 5%
		else if (location[0] < 16) {
			while (location[0] != 16) {
				location[0] += 1;
				currentOrientation = orientation[0];
				System.out.println("Now at " + location[0] + "th St. and " + location[1] + "th Ave. ... heading North.");
				this.gas -= 5;
			}
		}
		// If the avenue is greater than 4th, start driving East
		// Tell the user their current location
		// Make sure to always empty the gas tank by 5%
		if (location[1] > 4) {
			while (location[1] != 4) {
				location[1] -= 1;
				// Make sure to update the moped's orientation
				if (currentOrientation.equals("North")) {
					currentOrientation = orientation[1];
				}
				else if (currentOrientation.equals("South")) {
					currentOrientation = orientation[1];
				}
				System.out.println("Now at " + location[0] + "th St. and " + location[1] + "th Ave. ... heading East.");
				this.gas -= 5;
			}
		}
		// If the avenue is less than 4th, start driving West
		// Tell the user their current location
		// Make sure to always empty the gas tank by 5%
		else if (location[1] < 4) {
			while (location[1] != 4) {
				location[1] += 1;
				// Make sure to update the moped's orientation
				if (currentOrientation.equals("North")) {
					currentOrientation = orientation[3];
				}
				else if (currentOrientation.equals("South")) {
					currentOrientation = orientation[3];
				}
				System.out.println("Now at " + location[0] + "th St. and " + location[1] + "th Ave. ... heading West.");
				this.gas -= 5;
			}
		}
		
		// When the moped gets to the restaurant, tell the user
		if (location[0] == 16 && location[1] == 4) {
			System.out.println("We have reached the Petite Abeille. Enjoy your moules-frites.");
		}
	}
	
	/**
	 * Method that prints out all valid commands that the program takes
	 * This helps the user incase they don't know what to enter
	 * @param none
	 */
	public void help() {
		System.out.println("Valid Commands: ");
		System.out.println(" \"go right\" (turn right) ");
		System.out.println(" \"straight on\" (go straight down the streets) ");
		System.out.println(" \"back up\" (go back up the streets) ");
		System.out.println(" \"how we doin'?\" (how much gas do you have left) ");
		System.out.println(" \"fill 'er up\" (fill up the gas tank) ");
		System.out.println(" \"park\" (park the moped) ");
		System.out.println(" \"go to Petite Abeille\" (go to the restaurant Petite Abeille) ");
	}

	/**
	 * Method to check if the moped is at a spot that advertises the moped
	 * Make sure to print out a message about the business/shop if that happens
	 * @param none
	 */
	public void checkAdvertising() {
		// Check if the moped is at the American Museum of Natural History
		// Advertise a messsage about them if it is
		if (location[0] == 79 && location[1] == 8) {
			System.out.println("We have reached the American Museum of Natural History. "
								+ "Did you know that the museum is one of the world’s preeminent scientific and cultural institutions?");
		}
		// Check if the moped is at the Memorial Sloan Kettering Cancer Center
		// Advertise a messsage about them if it is
		else if (location[0] == 74 && location[1] == 1) {
			System.out.println("We have reached the Memorial Sloan Kettering Cancer Center. "
								+ "Did you know that the MSKCC is the world’s oldest and largest private cancer center?");
		}
		// Check if the moped is at the Strand Bookstore
		// Advertise a messsage about them if it is
		else if (location[0] == 12 && location[1] == 4) {
			System.out.println("We have reached the The Strand Bookstore. "
								+ "Did you know The Strand has 18 Miles of new, used and rare books, and has been in business since 1927?");
					}
		// Check if the moped is at the Fayda Coffee Tea Cookies Cake shop
		// Advertise a messsage about them if it is
		else if (location[0] == 3 && location[1] == 6) {
			System.out.println("We have reached Fayda Coffee Tea Cookies Cake shop. "
								+ "Did you know that this shop is a family owned business that fuses baked good recipes from Western "
								+ "and Eastern culture?");
		}
	}
	
	/*
	 * Method that checks if the moped is still in the city grid
	 * @param none
	 * @return boolean flag
	 */
	public boolean onGrid() {
		
		// Create a sentinel to keep track of the moped and whether or not it is on the grid
		boolean flag = false;
		
		// Make sure it doesn't drive to "0th Ave"
		if (location[1] == 1 && ( currentOrientation.equals("North") || currentOrientation.equals("South") || currentOrientation.equals("East") || currentOrientation.equals("West") ) ) {
			flag = true;
			return flag;
		}
		// Make sure it doesn't drive to "11th Ave"
		else if (location[1] == 10 && ( currentOrientation.equals("North") || currentOrientation.equals("South") || currentOrientation.equals("East") || currentOrientation.equals("West") ) ) {
			flag = true;
			return flag;
		}
		// Make sure it doesn't drive to "0th St"
		else if (location[0] == 1 && ( currentOrientation.equals("North") || currentOrientation.equals("South") || currentOrientation.equals("East") || currentOrientation.equals("West") ) ) {
			flag = true;
			return flag;
		}
		// Make sure it doesn't drive to "201th St"
		else if (location[0] == 200 && ( currentOrientation.equals("North") || currentOrientation.equals("South") || currentOrientation.equals("East") || currentOrientation.equals("West") ) ) {
			flag = true;
			return flag;
		}
		// Check all corners of grid
		else if (location[0] == 200 && location[1] == 1 && ( currentOrientation.equals("North") || currentOrientation.equals("South") || currentOrientation.equals("East") || currentOrientation.equals("West") ) ) {
			flag = true;
			return flag;
		}
		// Check all corners of grid
		else if (location[0] == 1 && location[1] == 1 && ( currentOrientation.equals("North") || currentOrientation.equals("South") || currentOrientation.equals("East") || currentOrientation.equals("West") ) ) {
			flag = true;
			return flag;
		}
		// Check all corners of grid
		else if (location[0] == 200 && location[1] == 10 && ( currentOrientation.equals("North") || currentOrientation.equals("South") || currentOrientation.equals("East") || currentOrientation.equals("West") ) ) {
			flag = true;
			return flag;
		}
		// Check all corners of grid
		else if (location[0] == 1 && location[1] == 10 && ( currentOrientation.equals("North") || currentOrientation.equals("South") || currentOrientation.equals("East") || currentOrientation.equals("West") ) ) {
			flag = true;
			return flag;
		}
		else {
			return flag;
		}
	}
	
} // class
