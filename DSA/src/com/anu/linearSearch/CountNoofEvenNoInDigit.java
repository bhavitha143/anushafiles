package com.anu.linearSearch;

public class CountNoofEvenNoInDigit {

	public static void main(String[] args) {
		int arr[] = { 11, 1111, 134, 124, 121, 100,12,1,16 };
		int countEvenNo=0,countOddNo=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEvenNo++;
				
			}
			else {
				countOddNo++;
				
			}
		}
			System.out.println("the no of even num:"  +countEvenNo);
			System.out.println("the no of Odd num:"  +countOddNo);

		}

	}


