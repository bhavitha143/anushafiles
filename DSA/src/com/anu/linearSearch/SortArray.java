package com.anu.linearSearch;

public class SortArray {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 4, 6, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);

		}
	}
}
