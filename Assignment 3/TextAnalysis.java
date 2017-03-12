/** 
 * @author Disha Gupta
 * Text Analysis Assignment - This program asks the user for a file name and then scans the file for specific verbal ticks 
 * 							  (specified by the user) and then gives the user data on the ticks.
 * 
 */

package edu.nyu.cs.dg2703;

// Import packages.
import java.io.*;
import java.util.*;

public class TextAnalysis {
	
	/**
	 * Method to count tics in the file and how many times they occur.
	 * @param an array of tics and an array of all the words in the file.
	 * @return how many times each tic was counted.
	 */
	public static int[] countTics(String[] tics, String[] text) {
		int[] ticsIndividualCounter = new int[tics.length];
		int totalNumberOfWords = text.length;
		
		// Set up a for loop to keep track of how many times each tic occurs.
		// Do this by storing each number in an array at the same position that the tic appears in its text array.
		for (int i = 0; i < totalNumberOfWords; i++) {
			for (int j = 0; j < tics.length; j++) { 
				if (text[i].contains(tics[j])) {
					ticsIndividualCounter[j] += 1;
				}
			}
		}
		
		return ticsIndividualCounter;
	}

	/**
	 * Method to calculate the proportion of each tic.
	 * @param an array of each individual tic and how many times it was counted and a double that contains the number of words in the file.
	 * @return how many times each tic was counted out of all of the tics.
	 */
	public static double[] proportionEachTic(int[] ticsIndividualCounter, double totalNumberOfWords) {
		double[] proportionEachTic = new double[ticsIndividualCounter.length];

		// Set up a for loop to calculate the proportion of each tic compared to all tics.
		for (int i = 0; i < proportionEachTic.length; i++) {
			proportionEachTic[i] += ( (ticsIndividualCounter[i] / totalNumberOfWords) * 100.0 );
		}
		return proportionEachTic;
	}
	
	/**
	 * Method to calculate the density of all tics combined out of all of the words.
	 * @param a double array with each tics proportions.
	 * @return density of all tics.
	 */
	public static double densityOfTics(double[] ticProportions) {
		int numTics = ticProportions.length;
		double density = 0;
		
		// Set up a for loop to calculate the total density of tics.
		for(int i = 0; i < numTics; i++) {
			density += ticProportions[i];
		}
		return density;
	}

	/**
	 * Method to open, read, and split the text file.
	 * @param the file name.
	 * @return an array of the words in the text file.
	 */
	public static String[] readFile(String fileName) throws FileNotFoundException { 
		String text = null;
		String line;
		Scanner input = new Scanner(new File (fileName));
		
		// Loop through the lines in the text file.
		while (input.hasNextLine()) {
			line = input.nextLine();
			text += line;
		}

		// Split the text in the array.
		String[] textArray = text.split(" ");
		return textArray;
	}

	public static void main(String[] args) throws FileNotFoundException {
	  // Create the scanner object.
	  Scanner input = new Scanner(System.in);
	  
	  // Ask the user for the file they want to open.
	  System.out.print("What file would you like to open? (Enter the file path): ");
	  String fileName = input.nextLine();
	
	  // Create the file object.
	  File file = new File(fileName);
	
	  // Ask the user what tics they want to search for.
	  System.out.print("What words would you like to search for? (Enter a comma separated list): ");
	  String tics = input.nextLine();
	  
	  // Split the array with the tics.
	  String[] ticsSplit = tics.split(",");
	  // Read the file.
	  String[] text = readFile(fileName);
	  int[] ticCounts = countTics(ticsSplit, text);
	  int totalNumberOfWords = text.length;
	  // Calculate the tic proportions.
	  double[] ticProportions = proportionEachTic(ticCounts, totalNumberOfWords);
	  double ticDensity = densityOfTics(ticProportions);
	  int ticsTotalCounter = 0;
	  int numTics = ticsSplit.length;
	  
	  // Count the total number of tics in a for loop.
	  for (int i = 0; i < numTics; i++) {
		  ticsTotalCounter += ticCounts[i];
	  }
	  
	  // Print out results.
	  System.out.println();
	  System.out.println("...............................Analyzing text.................................");
	  System.out.println();
	  System.out.println("Total Number of Tics: " + ticsTotalCounter);
	  System.out.println("Density of Tics: " + ticDensity );
	  System.out.println();
	  System.out.println("...............................Tic breakdown..................................");
	  System.out.println();
	  // Format the results and print them out by looping through each array.
	  for (int i = 0; i < ticsSplit.length; i++) {
		  System.out.format("%-10s / %20s          / %20s\n", ticsSplit[i], ticCounts[i] + " occurrences", ( (ticCounts[i]) / (ticsTotalCounter) * 100) + "% of all tics");
	  }

	  // Close the scanner.
	  input.close();
	
	}
	
}