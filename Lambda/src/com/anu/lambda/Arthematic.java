package com.anu.lambda;

@FunctionalInterface
public interface Arthematic {
	int operations(int a, int b);
	default String print(String msg) {
		msg="anusha";
		System.out.println(msg);
		return msg;
	}
}
class Anusha {
	public static void main(String[] args) {
			Arthematic 	Addition=(a,b)-> {
				int c=a+b;
				System.out.println("addition of a,b = "  + " " + c);
				return c;
			};
			Addition.operations(5, 10);
			
			Arthematic subtraction=( a, b)-> (a-b);
			int c=subtraction.operations(10, 10);
			System.out.println("sub of a,b = "  + " " + c);
			
			Arthematic division=(a,b)-> (a%b);
			int d=division.operations(10,20);
			System.out.println("division  of a,b = "  + " " + d);
}
}
