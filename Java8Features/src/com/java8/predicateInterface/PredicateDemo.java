package com.java8.predicateInterface;

import java.util.function.Predicate;

public class PredicateDemo {
	 static Boolean checkAge(int age){  
	        if(age>17)  
	            return true;  
	        else return false;  
	    }  
	    public static void main(String[] args){  
	        // Using Predicate interface  
	        Predicate<Integer> predicate =  PredicateDemo::checkAge;   // used static method references
	        // Calling Predicate method  
	        boolean result = predicate.test(5);  
	        System.out.println(result);  
	    }  
}
