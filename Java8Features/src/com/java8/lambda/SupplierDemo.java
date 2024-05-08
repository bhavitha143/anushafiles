package com.java8.lambda;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<LocalDate> {

	@Override
	public LocalDate get() {

		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		/*
		 * Supplier<LocalDate> dt =new SupplierDemo(); System.out.println(dt.get());
		 */
		
		Supplier<LocalDateTime> dt1=()->{
			
			return LocalDateTime.now();
		};
		System.out.println(dt1.get());
	}

}
