interface Anusha{
	
	static  String msg ="anu";
	
	static void  msg(String msg) {
		
		System.out.println(msg);
	}
	
	default void print() {
		System.out.println("print method");
	}
	
	abstract int add(int a,int b);
		
	}
interface Anil extends Anusha{
	
	abstract int add(int a,int b);
}

public class InterfaceDemo  implements  Anusha ,Anil{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
	public static void main(String[] args) {
		Anil id =new InterfaceDemo();
		Anil ani=new InterfaceDemo();
		id.print();
		Anusha.msg("srinadh");
		System.out.println(ani.add(12, 10));
	}

}
