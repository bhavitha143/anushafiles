package com.anu.lambda;

import java.util.function.Consumer;

// consumer Interface it takes only input does not return any result or output in dis case use consumer Interface
class Function implements Consumer<String> {

	
	  @Override public void accept(String t) { System.out.println("t is " + " "
	  +t); }
	 
}

public class ConsumerFunctionalInterfaceDemo {
	
public static void main(String[] args) {
	
	/*
	 * Consumer<String> cons=new Function(); cons.accept("anilkumar"); //now in
	 * lambda expressions
	 */	
	Consumer<String> consu=(s)->System.out.println(s);
	consu.accept("ravi");
}
}
