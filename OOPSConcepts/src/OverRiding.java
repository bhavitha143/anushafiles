
class Over {
	void name() {
		System.out.println("this is my name");
	}
}

class Shiva extends Over {
	void name() {
		System.out.println("this is my husband name");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		Shiva s = new Shiva();
		s.name();

		/*
		 * Over o = new Over(); o.name();
		 */

	}

}
