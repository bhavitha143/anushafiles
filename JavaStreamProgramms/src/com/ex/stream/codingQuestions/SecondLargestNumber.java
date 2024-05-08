package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class SecondLargestNumber {
	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(181);
		numberList.add(190);
		numberList.add(110);
		numberList.add(20);
		
		

	int num=  numberList.stream().distinct().sorted().mapToInt(x -> x)
				.skip(numberList.size() - 2).findFirst().getAsInt();
	
		
		System.out.println(num);
	}
}
