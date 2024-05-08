package com.java.stream;

public class ReverseInteger {
	
	
	static void reverse(int n) {
		int rev=0,rem=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		reverse(123);
	}
}
