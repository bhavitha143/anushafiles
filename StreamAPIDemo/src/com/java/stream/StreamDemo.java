package com.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
	
	Stream<Integer> stream=Stream.of(1,2,3);
	stream.forEach( System.out::println );
	
	// create stream for sources
	
	Collection<String> stream1=Arrays.asList("anu","anil","aji");
	
	stream1.forEach(System.out::println);
	}
	
	//stream for set
	
Set<String> stream2=  new HashSet<>();
	
	
	
}
