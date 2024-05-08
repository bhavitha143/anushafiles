
public interface InterfaceDemo {

	int x = 5;

	/*
	 * default int div(int x, int y) { return (x / y); }
	 */
	
	static void print(int x) {
		x=3;
		System.out.println(x);
	}
	
 abstract int print(int x, int y);

 
}

class Inter implements InterfaceDemo {

	@Override
	public int print(int x, int y) {
		
		return x*y;
	}
	
	public  int div(int x, int y) {
		return (x / y);
	}
	
	public static void main(String[] args) {
		Inter in =new Inter();
		System.out.println(in.div(10, 20));
		System.out.println(in.print(10, 10));
		System.out.println(in.x);
		InterfaceDemo.print(x);
		
	}

}
