package com.java.stream;

import java.util.Arrays;

public class ReverseArray {

	
	public static void main(String[] args) {
		int a[]= {1,23,45,6};
		reverse(a);
		System.out.println(Arrays.toString(a));
	}

	private static void reverse(int[] a) {
		int start =0;
		int end=a.length-1;
		while(start<end) {
			swap(a, start, end);
			start++;
			end--;
		}
		
	}
	
	private static void swap(int[] a,int index1 ,int index2) {
		int temp=0;
		temp=a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
		
	}
}
