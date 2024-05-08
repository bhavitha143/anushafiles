package com.anu.lambda.optional;

import java.util.Scanner;

public class Water {
	
	public static void main(String[] args) {
		
		Double basePrice =2.00;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the water");
		Double  water=sc.nextDouble();
		Double TotalPrice=basePrice*water;
		System.out.println(TotalPrice +" Rupees");
			
	}

}
