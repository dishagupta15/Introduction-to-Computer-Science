package edu.nyu.cs.dg2703;

import java.util.ArrayList;

public class MyCharacter extends OrderedThing {

	// Create an ArrayList of object Word that will be filled with characters
	ArrayList<Word> myCharacters = new ArrayList<Word>();
	
	char contents = 0;
	public int position = 0;
	
	public MyCharacter(char x, int y){
		this.contents = x;
		this.position = y;
	}
	
	public MyCharacter(char i) {
		this.contents = i;
	}

	public String toString() {
		return String.valueOf(contents);
	}
	
}
