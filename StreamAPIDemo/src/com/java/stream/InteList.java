package com.java.stream;

import java.util.ArrayList;

public class InteList {
public static void main(String[] args) {
	
	
	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(15);
	list.add(17);
	list.add(16);
	list.add(18);
	
	for(int n:list) {
		if(n%2==0) {
			System.out.println("even numbers");
		}
		else {
		System.out.println("odd numbers" +n);
	}
	
}
}
}
