/**
 * 
 * @author Disha Gupta
 * Virtual Moped Assignment (This program drives a moped around NYC and asks the users for instructions on where to go.)
 * 
 */

package edu.nyu.cs.dg2703;

// Import the Scanner package
import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {
		
		// Create a new Scanner
		Scanner input = new Scanner(System.in);
		
		// Tell the user where they are starting
		System.out.println("Thanks for jumping on the moped. We're currently parked outside "
							+ " of Rubin hall, one of NYU's freshmen dorms, at 10th St. and 5th Ave.");

		// Create a Moped instance
		Moped vehicle = new Moped();
		
		// Create a sentinel variable to check if the moped is ever parked
		// This will be used in a while loop to see if the program should continue
		// Initially set it to false because the moped will start off driving
		boolean isParked = false;
		
		// Create a variable that calls the howWeDoin() method to get the initial amount of gas
		// The starting value will always be 100 because the moped hasn't been driven anywhere yet
		// This wil be used in a while loop to see if the program should continue
		int gasPercentage = vehicle.howWeDoin();;
		
		// Create a variable to get the user's response
		String response; 
		
		// Set up a while loop that checks if there is gas in the moped or if the moped is parked
		// Initially both values will be true so the while loop should execute at least once
		while (gasPercentage > 0 && !isParked) {
			
			// Ask the user what they want to do 
			// Store their response
			System.out.println("What would you like to do?  At any time, say \"help\" for assistance.  ");
			response = input.nextLine();
			
			// Call the goLeft() method if the user enters "go left"
			// Always check to see if the user drove to a spot that advertises the moped
			if (response.equals("go left")) {
				vehicle.goLeft();
				vehicle.checkAdvertising();
				// Check if the user is at the edge of the grid
				// Let them know if they are
				// Loop through the prompt to make sure they don't leave the grid (to get them to enter a valid response)
				if (vehicle.onGrid()) {
					System.out.println("Be careful! You are almost at the edge of the grid! What would you like to do (you can not go left!)? ");
					response = input.nextLine();
					if (response.equals("go right"))
						vehicle.goRight();
					else if (response.equals("straight on"))
						vehicle.straightOn();
					else if (response.equals("back up"))
						vehicle.backUp();
					else if (response.equals("fill 'er up"))
						vehicle.fillErUp();
					else if (response.equals("how we doin'?"))
						vehicle.howWeDoin();
					else if (response.equals("go to Petite Abeille"))
						vehicle.goToPetiteAbeille();
					else if (response.equals("help"))
						vehicle.help();
					else if (response.equals("park")) {
						isParked = true;
						System.out.println("Your moped has been parked.");
					}
					while (response.equals("go left")) {
						System.out.println("Be careful! You are almost at the edge of the grid! What would you like to do (you can not go left!)? ");
						response = input.nextLine();
					}
				}
			}
			// Call the goRight() method if the user enters "go right"
			// Always check to see if the user drove to a spot that advertises the moped
			else if (response.equals("go right")) {
				vehicle.goRight();
				vehicle.checkAdvertising();
				// Check if the user is at the edge of the grid
				// Let them know if they are
				// Loop through the prompt to make sure they don't leave the grid (to get them to enter a valid response)
				if (vehicle.onGrid()) {
					System.out.println("Be careful! You are almost at the edge of the grid! What would you like to do (you can not go right!)? ");
					response = input.nextLine();
					if (response.equals("go left"))
						vehicle.goLeft();
					else if (response.equals("straight on"))
						vehicle.straightOn();
					else if (response.equals("back up"))
						vehicle.backUp();
					else if (response.equals("fill 'er up"))
						vehicle.fillErUp();
					else if (response.equals("how we doin'?"))
						vehicle.howWeDoin();
					else if (response.equals("go to Petite Abeille"))
						vehicle.goToPetiteAbeille();
					else if (response.equals("help"))
						vehicle.help();
					else if (response.equals("park")) {
						isParked = true;
						System.out.println("Your moped has been parked.");
					}
					while (response.equals("go right")) {
						System.out.println("Be careful! You are almost at the edge of the grid! What would you like to do (you can not go right!)? ");
						response = input.nextLine();
					}
				}
			}
			// Call the straightOn() method if the user enters "straight on"
			// Always check to see if the user drove to a spot that advertises the moped
			else if (response.equals("straight on")) {
				vehicle.straightOn();
				vehicle.checkAdvertising();
				// Check if the user is at the edge of the grid
				// Let them know if they are
				// Loop through the prompt to make sure they don't leave the grid (to get them to enter a valid response)
				if (vehicle.onGrid()) {
					System.out.println("Be careful! You are almost at the edge of the grid! What would you like to do (you can not go straight!)? ");
					response = input.nextLine();
					if (response.equals("go left"))
						vehicle.goLeft();
					else if (response.equals("go right"))
						vehicle.goRight();
					else if (response.equals("back up"))
						vehicle.backUp();
					else if (response.equals("fill 'er up"))
						vehicle.fillErUp();
					else if (response.equals("how we doin'?"))
						vehicle.howWeDoin();
					else if (response.equals("go to Petite Abeille"))
						vehicle.goToPetiteAbeille();
					else if (response.equals("help"))
						vehicle.help();
					else if (response.equals("park")) {
						isParked = true;
						System.out.println("Your moped has been parked.");
					}
					while (response.equals("straight on")) {
						System.out.println("Be careful! You are almost at the edge of the grid! What would you like to do (you can not go straight!)? ");
						response = input.nextLine();
					}
				}
			}
			// Call the backUp() method if the user enters "back up"
			// Always check to see if the user drove to a spot that advertises the moped
			else if (response.equals("back up")) {
				vehicle.backUp();
				vehicle.checkAdvertising();
				// Check if the user is at the edge of the grid
				// Let them know if they are
				// Loop through the prompt to make sure they don't leave the grid (to get them to enter a valid response)
				if (vehicle.onGrid()) {
					System.out.println("Be careful! You are almost at the edge of the grid! What would you like to do (you can not back up!)? ");
					response = input.nextLine();
					if (response.equals("go left"))
						vehicle.goLeft();
					else if (response.equals("go right"))
						vehicle.goRight();
					else if (response.equals("straight on"))
						vehicle.straightOn();
					else if (response.equals("fill 'er up"))
						vehicle.fillErUp();
					else if (response.equals("how we doin'?"))
						vehicle.howWeDoin();
					else if (response.equals("go to Petite Abeille"))
						vehicle.goToPetiteAbeille();
					else if (response.equals("help"))
						vehicle.help();
					else if (response.equals("park")) {
						isParked = true;
						System.out.println("Your moped has been parked.");
					}
					while (response.equals("back up")) {
						System.out.println("Be careful! You are almost at the edge of the grid! What would you like to do (you can not back up!)? ");
						response = input.nextLine();
					}
				}
			}
			// Call the howWeDoin() method if the user enters "how we doin'?"
			// Tell them how much gas they have left
			else if (response.equals("how we doin'?")) {
				System.out.println("The gas tank is currently " + vehicle.howWeDoin() + "% full.");
			}
			// Call the fillErUp() method if the user enters "fill 'er up"
			// Thell them their tank is now at 100%
			else if (response.equals("fill 'er up")) {
				vehicle.fillErUp();
				System.out.println("The gas tank is now 100% full.");
			}
			// If the user enters "park" change the isParked sentinel to true so the while loop will quit and the program will end
			// Tell the user their moped has been parked
			else if (response.equals("park")) {
				isParked = true;
				System.out.println("Your moped has been parked.");
			}
			// Call the goToPetiteAbeille() method if the user enters "go to Petite Abeille"
			else if (response.equals("go to Petite Abeille")) {
				vehicle.goToPetiteAbeille();
			}
			// Call the help() method if the user enters "help"
			else if (response.equals("help")) {
				vehicle.help();
			}
			// If the user does not enter a valid command tell them
			// Tell them to enter help to get a list of all valid commands
			else {
				System.out.println("Sorry, that's not a valid command!");
			}
			
			// Always check the current amount of gas after driving anywhere
			gasPercentage = vehicle.howWeDoin();
			
			// Check to see if the user is out of gas
			// If they are, tell them the program is quitting
			if (gasPercentage == 0) {
				System.out.println("You are out of gas! Goodbye!");
			}
			
		} // while loop
				
		// Close the Scanner
		input.close();
		
	} // main 
	
} // class
