package com.anu.lambda;
// it provide data to client it has one get method it does not take parameters

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*class SupplierImpl implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {  // normal way overriding concept
		
		return  LocalDateTime.now();
	}
	
}*/
public class SupplierInterface {

	public static void main(String[] args) {
		/*
		 * Supplier<LocalDateTime> sup=new SupplierImpl();
		 * System.out.println(sup.get());
		 */
	//using lamba we reduce above commented code overriding concept and classes all
		Supplier<LocalDateTime> sup1=	 () ->  LocalDateTime.now();
		System.out.println(sup1.get());
	}
}
