package com.collection.anu;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDebug {

	public static void main(String[] args) {

		HashMap<String, Integer> hs = new HashMap<>();
		hs.put("ruthvik", 1);
		hs.put("sai", 2);
		hs.put("Gnanasri", 3);
		hs.put("null", 2);
		hs.put("Gnanasri", 10);

		System.out.println(hs.get("null"));
	}
}
