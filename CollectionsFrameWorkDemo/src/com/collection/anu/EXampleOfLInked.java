package com.collection.anu;

import java.util.Iterator;
import java.util.LinkedList;

class Student1 {
	private String gender;

	@Override
	public String toString() {
		return "Student1 [gender=" + gender + "]";
	}

	Student1(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}

public class EXampleOfLInked {
	public static void main(String[] args) {

		LinkedList<Student1> list = new LinkedList<>();
		list.add(new Student1("male"));
		list.add(new Student1("female"));

		Iterator<Student1> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
