package com.collection.anu;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer>  ls =new LinkedHashSet<>();
		ls.add(1);
		ls.add(11);
		ls.add(123);
		ls.add(1234);
		ls.add(1);
		ls.add(10);
		Iterator<Integer>  it =ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
