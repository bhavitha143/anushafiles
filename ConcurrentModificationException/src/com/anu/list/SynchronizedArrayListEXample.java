package com.anu.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListEXample {

	public static void main(String[] args) {

		ArrayList<String> sal = new ArrayList<>();

		sal.add("Geeks");
		sal.add("for");
		sal.add("Geeks");
		sal.add("Computer");
		sal.add("Science");
		sal.add("Portal");

		System.out.println(sal);

		// Synchronizing above List
		// using SynchronizedList() method
		Collections.synchronizedList(sal);

		// Synchronized block to
		// avoid non-deterministic behavior
		synchronized (sal) {

			Iterator<String> itrobj = sal.iterator();

			while (itrobj.hasNext()) {

				System.out.println(itrobj.next());
			}
		}
	}
}
