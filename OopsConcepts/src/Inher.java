interface Anushka{
	
	default int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	default void del() {
		System.out.println("delete method");
	}
}
interface Shiva extends Anushka {
	
	default int add(int a, int b) {
		System.out.println(a-b);
		return a-b;
	}
}
class Inher implements Anushka,Shiva{
	
	
	public static void main(String[] args) {
		
		
		Anushka anu =new Inher();
		anu.del();
		anu.add(14, 10);
	}

}