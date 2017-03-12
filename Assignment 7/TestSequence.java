package edu.nyu.cs.dg2703;

public class TestSequence {
	
	public static void main(String[] args) {
		
		// Create new Sentence object
		Sentence sentence = new Sentence("Walter walked wearily while wondering where Wally was");
		
		// Test out Sentence methods
		Word firstWord = sentence.getFirst();
		String firstWordString = firstWord.toString();
		System.out.println("The first word in the sentence is \"" + firstWordString + "\".");
		
		Word lastWord = sentence.getLast();
		String lastWordString = lastWord.toString();
		System.out.println("The last word in the sentence is \"" + lastWordString + "\".");
		
		System.out.println("The words in the sentence are " + sentence.getSequence() + ".");
		
		// Create new Word object
		Word word = new Word(0, "Walter");
		
		// Test out Word methods
		System.out.println("The first character of the word is \"" + word.getFirst() + "\".");
		System.out.println("The last character of the word is \"" + word.getLast() + "\".");
		System.out.println("The characters in the word are " + word.getSequence() + ".");
		System.out.println("The position of the character in the word is " + word.getPosition() + ".");
	}

}
