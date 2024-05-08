class Operation{
	void print() {
		System.out.println("parent method");
	}
}
class Addition  extends Operation{
	public int add(int x, int y) {
	return x+y;
	}
}
class Subtraction extends Operation{
	public int sub(int x,int y) {
		return x-y;
	}
}


public class Heirachical  {
	public static void main(String[] args) {

		Addition a= new Addition();
		a.add(10,20);
		a.print();
		Subtraction s=new Subtraction();
		s.print();
		s.sub(5, 5);
		System.out.println(a);
		System.out.println("addtion is :" + a);
		System.out.println("subtraction is :" + s);
		
	}
	
	

}
