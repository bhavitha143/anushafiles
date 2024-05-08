package com.java8.lambda;

import java.util.function.Consumer;

public class ConsumerDemo  implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	
	public static void main(String[] args) {
		// normal way 
		Consumer<String> cs =new ConsumerDemo();
		cs.accept("i am learned java 8");
		
		// using lambda
		
		Consumer<String> consume=	( t) ->System.out.println(t);
		consume.accept("i got job");
	}

}
