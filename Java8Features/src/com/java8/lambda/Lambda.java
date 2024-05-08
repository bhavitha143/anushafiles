package com.java8.lambda;

interface Mobile {

	abstract void sim();

}

class Idea implements Mobile{

	@Override
	public void sim() {
		//System.out.println("Idea sim is using");
		
	}
	
}


public class Lambda {
	public static void main(String[] args) {
		// normal approach

		Idea i= new Idea();
		i.sim();
		// using lambda

		Mobile airtel = () -> {
			System.out.println("airtel sim is using");

		};
		airtel.sim();
		Mobile voda = () -> System.out.println("vodafone sim is using");
voda.sim();
	}
}