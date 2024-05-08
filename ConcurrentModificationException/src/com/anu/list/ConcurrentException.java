package com.anu.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentException {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(Arrays.asList("anu", "lavi", "srinu", "raju"));
		// CopyOnWriteArrayList<String> list = new
		// CopyOnWriteArrayList<>(Arrays.asList("anu", "lavi", "srinu", "raju"));

		for (String slist : list) {
			System.out.println(slist);

			slist.equals(list);
			list.remove("lavi");

		}

		/*
		 * Collections.synchronizedList(list); synchronized (list) {
		 * list.add("anushakolli"); list.remove("lavi"); }
		 */
		System.out.println("aftr removing the lavi item in list " + list);

		List<String> itr = Collections.synchronizedList(list);
		
		/*
		 * while (itr.hasNext()) { System.out.println("before removing the list " +
		 * itr.next()); itr.remove();
		 * 
		 * }
		 */

	}
}
