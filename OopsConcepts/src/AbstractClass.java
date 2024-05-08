abstract class Sana {

	int x;

	public abstract int add(int x, int y);

	static void print() {
		System.out.println("this is my name");
	}

	Sana(int x, int y) {
		System.out.println(x / y);
	}

}


public class AbstractClass extends Sana {

	AbstractClass(int x, int y) {
		super(x, y);
	}

	@Override
	public int add(int x, int y) {

		return (x + y);
	}

	public static void main(String[] args) {

		Sana cs = new AbstractClass(10, 5);

		System.out.println(cs.x);
		System.out.println(cs.add(10, 100));

	}
}
