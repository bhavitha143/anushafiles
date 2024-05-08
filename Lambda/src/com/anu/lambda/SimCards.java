package com.anu.lambda;

interface Sim {

	void data();
	
}

public class SimCards {

	public static void main(String[] args) {

		Sim airtel = () -> System.out.println("airtel sim");
		airtel.data();

		Sim voda = () -> System.out.println("voda sim");
		voda.data();
	}

}
