package edu.nyu.cs.dg2703;

import java.util.ArrayList;

public class Word extends OrderedThing implements SequentiallyOrdered {
	
	// An instance field of type ArrayList<MyCharacter> which will store a word's character sequence as MyCharacter objects
	ArrayList<MyCharacter> charSequence = new ArrayList<MyCharacter>();
	public int position = 0;
	
	public MyCharacter getFirst() {
		MyCharacter first = charSequence.get(0);
		return first; // should return the first MyCharacter object of the Word
	}
	
	public MyCharacter getLast() {
		MyCharacter last = charSequence.get(charSequence.size() - 1);
		return last; // should return the last MyCharacter object of the Word
	}
	
	public ArrayList<OrderedThing> getSequence() {
		ArrayList<OrderedThing> chars = new ArrayList<OrderedThing>();
		for (MyCharacter x: charSequence) {
			chars.add(x);
		}
		return chars; // should return an ArrayList<MyCharacter> of all the MyCharacter objects in the Word
	}
	
	public int getPosition() {
		return position; // should return the int representing the Word's position in the sentence
	}
	
	public String toString(){
		String returnString = new String("");
		for (MyCharacter i : charSequence) {
			returnString += i.toString();
		}
		return returnString;
	}
	
	public Word(int y, String x){
		// Counter keeps track of the position of each char in the words
		int counter = 0;
		for (char i : x.toCharArray()) {
			MyCharacter mychar = new MyCharacter(i);
			this.charSequence.add(counter,mychar);
			counter++;
		}
		this.position = y;
		// A String parameter and add the individual characters of the String to the ArrayList<MyCharacter> instance field
		// An int parameter representing the position of the Word in a Sentence and set the relevant instance field accordingly
	}
	
}
