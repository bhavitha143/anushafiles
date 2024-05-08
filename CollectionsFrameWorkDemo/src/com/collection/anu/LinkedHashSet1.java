package com.collection.anu;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {
	
	
	LinkedHashSet<String> lset=new LinkedHashSet();
	lset.add("Apple");
	lset.add("mango");
	lset.add("Kiwu");
	lset.add("Custord");
	Iterator <String> ht=lset.iterator();
	while(ht.hasNext()) {
		System.out.println(ht.next());
	}
}
}
