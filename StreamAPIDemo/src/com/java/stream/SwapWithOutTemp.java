package com.java.stream;

public class SwapWithOutTemp {
public static void main(String[] args) {
	
	String  a="anusha";
	String b="abburi";
	a=a+b;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	
			
	System.out.println(a +" " +b);
	int x=10,y=9;
	
System.out.println("before Swapping" + x + " "+y);
	
	/*
	 * x=x+y; y=x-y; x=x-y;
	 */
	System.out.println("after Swapping" + x);
	System.out.println("after swapping" +y);
	
	
	x=x*y;
	y=x/y;
	x=x/y;
			
}
}
