package com.collection.anu;

import java.util.Iterator;
import java.util.TreeSet;

public class Trsee {
public static void main(String[] args) {
	TreeSet<Integer> ts =new TreeSet<>();
	ts.add(19);
	ts.add(10);
	ts.add(9);
	ts.add(8);
	System.out.println(ts);
	Iterator<Integer>  tsint=ts.descendingIterator();
	while(tsint.hasNext()) {
		System.out.println(tsint.next());
	}
	
}
}
