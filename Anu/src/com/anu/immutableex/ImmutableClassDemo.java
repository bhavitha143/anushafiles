package com.anu.immutableex;

final public class ImmutableClassDemo {

	final private int a;

	final private int b;
	private Address address;

	@Override
	public String toString() {
		return "ImmutableClassDemo [a=" + a + ", b=" + b + ", address=" + address + "]";
	}

	public ImmutableClassDemo(int a, int b, Address address) {
		super();
		this.a = a;
		this.b = b;
		this.address = address;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public Address getAddress() {
		return new Address(address.getCity(), address.getName());
	}

	public static void main(String[] args) {
		Address address = new Address("nrt", "anusha");
		ImmutableClassDemo demo = new ImmutableClassDemo(10, 20, address);
		System.out.println(demo);
		Address ad = demo.getAddress();
		ad.setCity("guntur");
		ad.setName("anil");

		
		System.out.println("after " + demo);

	}

}
