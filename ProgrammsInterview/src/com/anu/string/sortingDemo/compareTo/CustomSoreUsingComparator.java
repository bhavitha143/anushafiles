package com.anu.string.sortingDemo.compareTo;

import java.util.ArrayList;
import java.util.Collections;

import com.anu.string.sortingDemo.MyUtil;
import com.anu.string.sortingDemo.Student;

public class CustomSoreUsingComparator {
	public static void main(String[] args) {

		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new Student(1, "anus", "pmr", 190));
		stu.add(new Student(2, "anusha", "gnt", 99));
		stu.add(new Student(3, "Raghav", "vizag", 90));
		MyUtil.iterateList(stu);
		Collections.sort(stu, new SongComparator());
		System.out.println("after sorting data by marks ****************************");

		System.out.println(stu);
		
		
		
		Collections.sort(stu, new SortUsingComparatorWithNameDec());
		System.out.println("after sorting data by Names in descending ****************************");

		System.out.println(stu);
		
		Collections.sort(stu, new SortingForRollno());
		System.out.println("after sorting data by rollno in descending ****************************");
		System.out.println(stu);


	}

}
