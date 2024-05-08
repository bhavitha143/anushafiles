package com.java.stream;

public class FIBnacciRecurssion {
static void fib(int n) {
	int a=0,b=0,c=1;
	
	for(int i=0;i<=n;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println("the fiba series" +a);
	}
	
}

public static void main(String[] args) {
	fib(7);
}
}
