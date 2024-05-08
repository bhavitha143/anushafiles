package com.java.stream;

public class CheckStringhaveDigit {

	
	static void onlyDigits(String str) {
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(Character.isDigit(c[i])) {
				System.out.println(c[i]);
				
			}
		}
	
		
	}
	public static void main(String[] args) {
		onlyDigits("anu   123");
		//System.out.print(onlyDigits("anusha123"));
	}
}
