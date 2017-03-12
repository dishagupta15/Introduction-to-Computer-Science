package edu.nyu.cs.dg2703;

import java.util.ArrayList;

public interface SequentiallyOrdered {

	// Given interface
	public OrderedThing getFirst();
	public OrderedThing getLast();
	public ArrayList<OrderedThing> getSequence();
	
}
