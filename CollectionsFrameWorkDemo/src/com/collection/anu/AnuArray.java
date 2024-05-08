package com.collection.anu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class AnuArray {
public static void main(String[] args) {
	
	ArrayList<String> list=new ArrayList<>(Arrays.asList("apple","mango","kiwi"));
	
	Iterator<String> it =list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("_____using LISTITERATOR_ NORMALOREDER__________________________________");
	ListIterator<String> listitr=list.listIterator();
	while(listitr.hasNext()) {
		System.out.println(listitr.next());
	
	}

	System.out.println("____________REVERSEORDER____________________________");
	
	while(listitr.hasPrevious()) {
		System.out.println(listitr.previous());
	
	}
	
}
}
