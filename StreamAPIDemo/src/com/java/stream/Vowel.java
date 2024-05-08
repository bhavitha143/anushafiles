package com.java.stream;

public class Vowel {
public static void main(String[] args) {
	
	
	String s="anusha";
	
	char[] c=s.toCharArray();
	for(int i=0;i<c.length;i++) {
		
		if(c[i]=='a' || c[i]=='A' ) {
			System.out.println(s.charAt(i));
		}
		
		else if(c[i]=='e' || c[i]=='E' ) {
			System.out.println(s.charAt(i));
		}
		if(c[i]=='i' || c[i]=='I' ) {
			System.out.println(s.charAt(i));
		}
		if(c[i]=='o' || c[i]=='O' ) {
			System.out.println(s.charAt(i));
		}
		if(c[i]=='u' || c[i]=='U' ) {
			System.out.println(s.charAt(i));
		}
		//System.out.println(s.charAt(i));
	}
}
}
