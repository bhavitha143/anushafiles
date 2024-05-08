
public class Singleton {
	
	// declare static variable using the class instance 
	
	
	private static Singleton single=null;
	
	// declare private constructor
	
	private Singleton() {
		
	}
	
	// create static factory method
	
	
	private static Singleton getInstance() {
		if(single==null) {
			single=new Singleton();
		}
		return single;
	}
	
	public static void main(String[] args) {
		Singleton ss =Singleton.getInstance();
		System.out.println(ss);
		
		
		Singleton s2 =Singleton.getInstance();
		System.out.println(s2);
	}
}
