package com.collection.anu;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String>  hs =new HashSet<>();
		hs.add("phd");
		hs.add("mca");
		hs.add("mba");
		hs.add("nec");
		hs.add("phd");
		
		
		Iterator<String> it =hs.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
	}
	

}
