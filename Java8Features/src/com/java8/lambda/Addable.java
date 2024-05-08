package com.java8.lambda;
interface Operation{
	int add(int x, int y);
	
}

class Addition implements Operation{

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}
	
}
public class Addable {
public static void main(String[] args) {
	
	  Operation addition=(int x, int y) ->{ return (x+y);
	};
	System.out.println(addition.add(100, 20));
	
}
}
