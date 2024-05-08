package com.collection.anu;

import java.util.ArrayList;
import java.util.Arrays;

class Animal {

	void add() {
		System.out.println("Animal");
	}
}

public class TestingTcs extends Animal {
	public static void main(String[] args) {

		
		String s =new String("Anusha");
		String str="Anusha";
		String str2="Anusha";
		String str3=str2.intern();
		System.out.println(str==str3);
		
		
		int a[] = { 12, 2 };
		int z= TestingTcs.test(a);
		System.out.println(z);
		
 
	}
	
	private static int test(int a[]) {
		
		try {
			a[2] = a[0]/a[1];
			
			try {
				a[2]=0;
			}
			catch(Exception ex) {
				ex.getMessage();
			}
			//throw new ArrayIndexOutOfBoundsException("try block called");
		
			//return 1;

		}
		catch(Exception e) {
			e.getMessage();
		}
		finally {
			System.out.println("finally block executed");
			return 1;
		}

	}
}

	// ArrayList<String> slist=new ArrayList<>();
	// slist.add(null);
	// System.out.println(slist);


