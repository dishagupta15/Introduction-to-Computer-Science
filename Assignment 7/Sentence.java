package edu.nyu.cs.dg2703;

import java.util.ArrayList;

public class Sentence implements SequentiallyOrdered {
	
	// A single instance field of type ArrayList<Word> which will store the Words of a sentence
	ArrayList<Word> words = new ArrayList<Word>();
	
	public Word getFirst() {
		Word first = words.get(0);
		return first; // should return the first Word of the Sentence
	}

	public Word getLast() {
		Word last = words.get(words.size() - 1);
		return last; // should return the last Word of the Sentence
	}
	
	public ArrayList<OrderedThing> getSequence() {
		ArrayList<OrderedThing> words2 = new ArrayList<OrderedThing>();
		for (Word x: words) {
			words2.add(x);
		}
		return words2; // should return an ArrayList<Word>
	}
	
	public String toString() {
		String returnString = new String("");
		for (Word i : words) {
			returnString += i.toString();
		}
		return returnString;
	}
	
	// The Sentence constructor should take a single String parameter representing the Sentence, 
	// and add each Word of the sentence to the ArrayList<Word>
	public Sentence(String sentence) {
		String[] spl = sentence.split("\\s+");
		int counter = 0;
		
		for (int i = 0; i < spl.length; i++) {
			Word word = new Word(i, spl[i]);
			words.add(counter,word);
			counter++;
		}	
	}
	
}
