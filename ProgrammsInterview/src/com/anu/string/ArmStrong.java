package com.anu.string;

import java.util.Scanner;

public class ArmStrong {
	
	public static void main(String[] args) {
		
		int num,c=0;
		int a,temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter num");
		num =sc.nextInt();
		temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}if(temp==c) {
			
			
		
		System.out.println("the no is armstrong" );
		}
		else {
			System.out.println("the no is not armstrong" );
		}
	}

}
