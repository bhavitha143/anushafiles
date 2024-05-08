package com.collection.anu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NeedOfCollections {
	
	public static void main(String[] args) {
		
		ArrayList<String> l1=new ArrayList<>();
		l1.add("anusha");
		l1.add("anil");
		l1.add("sai");
		l1.add(1,"ravi");
		
		/*
		 * System.out.println(l1); System.out.println(l1.subList(0,2));
		 * System.out.println(l1.get(2)); System.out.println(l1.add("anjali"));
		 * System.out.println("after adding " + l1);
		 */
		// using for loop
		for(int i= 0;i< l1.size(); i++) {
			System.out.println(l1.get(i));
		
		}
		
				ArrayList<String> l2=new ArrayList<>();
		l2.add("sa");
		l2.add("ra");
		l2.add("gnanasri");
		l2.addAll(l1);
		l2.toArray(); 
	l2.subList(0, 1);
	// using foreach loop
	
	
	for (String g: l2) {
		System.out.println(g);
	}
		 
		
		}
	
}
