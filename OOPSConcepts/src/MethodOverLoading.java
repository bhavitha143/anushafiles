class Poly {
	void add(int x, int y) {
		System.out.println(x - y);
	}
}

public class MethodOverLoading extends Poly {

	void add() {
		System.out.println("addition");
	}

	void add(int x, int y) {
		System.out.println(x + y);
	}

	void add(double x, double y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		MethodOverLoading ml = new MethodOverLoading();
		//Poly m2 = new Poly();

		ml.add();
		ml.add(2.0567, 3.05678);

		ml.add(10, 10);
		//m2.add(15, 10);

	}
}