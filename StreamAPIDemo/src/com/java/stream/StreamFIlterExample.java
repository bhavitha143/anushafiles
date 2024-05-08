package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFIlterExample {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		// normal way

		/*
		 * for (Product product : getAll()) { if (product.getPrice() > 1000) {
		 * list.add(product); } } for (Product list2 : list) {
		 * System.out.println(list2);
		 * 
		 * }
		 */

		for (Product product : getAll()) {
			if (product.getPrice() > 100) {
				product.setPrice(product.getPrice() + 1000);
				list.add(product);
			}
		}
		for (Product list2 : list) {
			System.out.println(list2);

		}
		// using streams for above code

		/*
		 * List<Product> anu = getAll().stream().filter((product) -> product.getPrice()
		 * > 1000) .collect(Collectors.toList());
		 */
		List<Product> anusha = getAll().stream().map(t -> {
			t.setPrice(t.getPrice() * 3 / 2);
			return t;
		}).collect(Collectors.toList());

		// System.out.println(anu);
		System.out.println(anusha);
	}

	private static List<Product> getAll() {
		List<Product> prod = new ArrayList<Product>();
		Product pr = new Product();
		pr.setId(7);
		pr.setName("ramadevi");
		pr.setPrice(100000);
		prod.add(pr);
		prod.add(new Product(1, "anu", 10000));
		prod.add(new Product(2, "anil", 2000));
		prod.add(new Product(3, "shiva", 100000));
		prod.add(new Product(4, "rag", 1000));
		return prod;

	}

}

class Product {

	private int id;
	private String name;
	private int price;

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
