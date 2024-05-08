package com.anu.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Example2WithThreads  implements Runnable{
	
	ArrayList<String> list =new ArrayList<>(Arrays.asList("a","b","c","d","e"));

	public void run() {
		// fetch elements from the list  names 
		Iterator<String> collectionOfNames=list.iterator();
		while(collectionOfNames.hasNext()) {
			String list12=collectionOfNames.next();
			System.out.println(list12);
		}
		
	}
	public static void main(String[] args) {
		Example2WithThreads thread =new Example2WithThreads();
		Thread t =new Thread(thread);
		t.start();
	}
	
	

}
