package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.List;

public class MaxMinWithStreams {
public static void main(String[] args) {
	
	
	
	List<Integer> numberList=new ArrayList<>();
	numberList.add(1);
	numberList.add(101);
	numberList.add(90);
	numberList.add(40);
	numberList.add(20);
	int max=numberList.stream().mapToInt(x->x).max().getAsInt();
	int min=numberList.stream().mapToInt(x->x).min().getAsInt();
	System.out.println(max+ " " + "maximum number in alist");
	System.out.println(min+ " " + "minimum number in alist");
	
}
}
