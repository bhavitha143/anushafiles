package com.java.stream;

public class PalindromeString {
public static void main(String[] args) {
	
	String s="mam";
	String temp = s;
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	if(temp.equalsIgnoreCase(rev)) {
		System.out.println("given one is  palindrome" +temp);
	}
	else {
		System.out.println(" not  palindrome");
	}
}
}
