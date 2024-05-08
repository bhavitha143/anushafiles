package com.java.stream;

import java.util.Scanner;

public class Factorial {
	static int fact(int n) {

		if (n == 1)
			return 1;
		int x = n * fact(n - 1);
		return x;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int z = fact(4);

		System.out.println(z);
	}

}
