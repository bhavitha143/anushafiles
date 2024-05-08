package com.java.stream;

import java.util.Scanner;

public class RemoveSpace {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter String");
//	String s=sc.nextLine();
	
	String s="anusga love";
	s=s.replaceAll("\\s", "");
	System.out.println(s);
}
}
