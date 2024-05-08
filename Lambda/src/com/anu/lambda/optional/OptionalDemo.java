package com.anu.lambda.optional;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) throws IllegalAccessException {
		
	
	
	// optional is nothing but we  can  reduce null checks and null pointer exceptions
	// some of  static  method in Optional concept
	
	//of,empty,OfNullable
	
	Optional<Integer> emptyOptional=Optional.empty();
	System.out.println(emptyOptional);
	
	// if yoou give id is null throw NPE otherwise it give value 
	Integer id=12;
	Optional<Integer> idOptional=Optional.of(id);
	System.out.println(idOptional);
	
	String mail="anusha23@gmail.com";
	// you want retrieve data from optional class use get method
	Optional<String> nullOptional=Optional.ofNullable(mail);
	System.out.println(nullOptional.get());
	// we can not use get directly in real time projects first we check value is present or not 
	if(nullOptional.isPresent()) {
		System.out.println(nullOptional.get());
	}

	// if you pass null it does not throw NPE
	Optional<String> nullOptional2=Optional.ofNullable(mail);
	System.out.println(nullOptional2);	
	// orElse method it gives present value may value is not there give default value
	String name="name";
	Optional<String> nameOptional=Optional.ofNullable(name);
	System.out.println(nameOptional.orElse("anil"));
	
	System.out.println(nameOptional.orElseGet(()->"anushaAnjani@mail.com"));
	// orElseGet() method it takes supplier interface we have to implement lambda 
	// orElse() and orElseGet() both are same but input type is different 
	// orElse() takes input string
// orElseThrow() it throw exception 
	//System.out.println((nameOptional.orElseThrow(()-> new IllegalAccessException("name is not valid"))));
	
	/*
	 * // filter () method String don="sana"; if(don!=null && don.contains("sana"))
	 * { System.out.println(don); }
	 */
	// now we use optional with filter for above impl 
	
	String don ="sana";
	Optional<String> strOption=Optional.of(don);
	strOption.filter(res -> res.contains("sana")).
	ifPresent((res-> System.out.println(res)));
	// map method is provide a way to transform value in optional from one type to another 

	Optional<String> strOption1=Optional.of(don);
	strOption1.filter(res -> res.contains("sana"))
	.map(String::toUpperCase)
	.ifPresent((res-> System.out.println(res)));
}
}
