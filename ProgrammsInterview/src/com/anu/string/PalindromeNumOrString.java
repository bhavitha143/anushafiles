package com.anu.string;

import java.util.Scanner;

public class PalindromeNumOrString {

	public static void main(String[] args) {

		String reverse = "", original;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num or String");
		original = sc.nextLine();
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equalsIgnoreCase(reverse)) {
			System.out.println("the num or string is palindrome");
		} else {
			System.out.println("the num or string is not palindrome");
		}
	}
}
