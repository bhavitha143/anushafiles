package com.anu.lambda;

import java.util.function.Function;

class FunctionImpl implements Function<String,Integer>{

	@Override
	public Integer apply(String t) {
		
		return t.length();
				
	}
	
}
 
//Function<T, R> function interface takes  type is input and produce the result .and it have only one method 
//  R apply(T t); it is method

public class FunctionalInterfaceDemoEx {
	public static void main(String[] args) {
		
		Function<String, Integer> fuc=(String s)->{
			return s.length();
		};
		System.out.println(fuc.apply("anushakolli"));
		
	}

}
