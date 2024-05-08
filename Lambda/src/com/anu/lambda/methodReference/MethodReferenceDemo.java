package com.anu.lambda.methodReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

@FunctionalInterface
 interface Accept{
	
	int apply(int a, int b);
}
public class MethodReferenceDemo {
	
	public static int addition(int a, int b) {
		return (a+b);
	}

	int print(int a,int b) {
		return (a-b);
	}
	
	public static void main(String[] args) {

		// using lambda 

		/*
		 * Accept consume= ( a,b)->{ int c=(a+b); System.out.println(c); return c; };
		 */
		
		Accept  consume1= (a,b)-> MethodReferenceDemo.addition(a,b);
			System.out.println(consume1.apply(10,20));
			
			// using methodreferences in lambda
			Accept  consume2=  MethodReferenceDemo::addition;
			System.out.println(consume2.apply(11, 20));
			
		// 1. method reference to a static method
		// using lambda here math.sqrt is static method
		
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(9));
		
		// using methodreferences in lambda
		Function<Integer, Double> functionReference = Math::sqrt;
		System.out.println(functionReference.apply(25));
		
		// method reference instance method of object
		MethodReferenceDemo reference=new MethodReferenceDemo();
		
		Accept acc=(a,b)->reference.print(a, b);
		System.out.println(acc.apply(30, 20));
		
		// using methodreferences as object  in lambda 
		Accept accep=reference::print;
		System.out.println(accep.apply(17, 12));
		
		// method reference to a constructor
		List<Integer> data=new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		
		// using lambda
		Function<List<Integer>, Set<Integer> > ass=(DataList)-> new HashSet<>(DataList);
		System.out.println(ass.apply(data));
		
		//using method reference in constructor 
		Function<List<Integer>, Set<Integer> > ass1= HashSet::new;
	System.out.println(ass1.apply(data));
	}
}
