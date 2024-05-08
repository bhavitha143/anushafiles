package com.collection.anu;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> hm =new LinkedHashMap<>();
		
		hm.put("anusha", 90);
		hm.put("anil", 70);
		hm.put("aji", 70);
		hm.put("anjani", 80);
		hm.put("arun", 60);
		hm.put("aji", 50);
		
		
	
		for(Entry<String, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey() + entry .getValue());
			
		}

}}