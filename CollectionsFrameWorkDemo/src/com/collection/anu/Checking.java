package com.collection.anu;

import java.util.Objects;

public class Checking {

	@Override
	public String toString() {
		return "Checking [age=" + age + "]";
	}

	public Checking(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	public static void main(String[] args) {

		Checking ch = new Checking(12);
		Checking ch1 = new Checking(12);
		System.out.println(ch.equals(ch1));
		System.out.println(ch==ch1);

		String str = new String("Anusha");
		String str1 = new String("Anusha");
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		Integer x = 127;
		Integer y = 127;
		System.out.println(x.equals(y));
		System.out.println(x==y);

	}

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Checking other = (Checking) obj;
		return age == other.age;
	}
}
