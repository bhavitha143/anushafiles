package com.collection.anu;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Sana> v = new Vector<>();
		v.add(new Sana("anu"));
		
		v.add(new Sana("raju"));

		Iterator<Sana> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println(v.capacity());
	}

}

class Sana {
	@Override
	public String toString() {
		return "Sana [name=" + name + "]";
	}

	private String name;

	public Sana(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}