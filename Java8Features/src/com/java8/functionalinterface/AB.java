package com.java8.functionalinterface;

// FI is have Only ONE SAM and ZERO or More Default and static methods

// why FI have only One SAM because LAMBDA EXPRESSION  provide IMPLEMENTATION for  only one ABSTRACT  METHOD  

@FunctionalInterface
public interface AB {

	//public abstract void m1();
	public abstract void add(int a, int b);

	default void m2() {
		System.out.print(1);
	}

	static void getname(String name) {
		name = "anjali";
		System.out.println(name);
	}

}
