package com.java.stream;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		
		LinkedList<String>  list=new LinkedList<>();
		
		list.add("zani");
		list.add("raju");
		list.add("anusha");
		list.add("jnanavi");
		
		//Iterator<String>  list1=list.descendingIterator();
		
		ListIterator<String>  list2= list.listIterator();
			
		while(list2.hasPrevious()) {
			System.out.println(list2.previous());
		}
		
		
		
	}

}
