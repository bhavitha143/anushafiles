package com.java8.functionalinterface;

class A {
	public static void main(String[] args) {
		/*
		 * AB b = () -> { System.out.println("abstarct method in  FI"); }; b.m1();
		 */

		AB b1 = (int a, int b) -> {
			System.out.println(a + b);
		};
		b1.add(10, 20);
		AB.getname("Anusha");
	}
}
