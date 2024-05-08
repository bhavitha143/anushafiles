package com.java8.lambda;

import java.util.function.Function;

public class FunctionalInterfaceDemo implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {

		return t.length();
	}
	
	public static void main(String[] args) {
		
		
		// normal way
		Function<String, Integer>  fst = new	 FunctionalInterfaceDemo();
			System.out.println(fst. apply("Gnanasri"));
			
	//using lambda
	
	Function<String, Integer>  fun = (String t)->  t.length();
	System.out.println(fun.apply("AbburiGnanasri"));
		
	
			
		}
}
	

