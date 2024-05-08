package com.java.stream;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("the given num is prime" +n);
		}
		else {
			System.out.println("the given num is  not  prime" +n);
		}
		
	}

}
