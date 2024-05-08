  package com.collection.anu;

import java.util.ArrayList;
import java.util.List;

class Student {
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	private int age;
	private String name;
	private double salary;

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	Student(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

}

public class ExampleForArray {
	public static void main(String[] args) {
		
	
	ArrayList<Student> asss = new ArrayList<>();

	
for(Student ss: getAll()) {
	if(ss.getSalary()>3000) {
		ss.setsalary(ss.getSalary()+ 10000);
		asss.add(ss);
	}
}
for(Student st:asss) {
	System.out.println(st);
    }
	}

	private static List<Student> getAll() {
		ArrayList<Student> as = new ArrayList<>();
		as.add(new Student(17, "anil", 30000));
		as.add(new Student(29, "Anusha", 70000));
		return as;

	}

}