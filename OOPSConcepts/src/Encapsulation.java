
public class Encapsulation {
	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void find(int age,String name) {
		System.out.println("this is my name" + name + "this is my age" + age);
	}
public static void main(String[] args) {
	Encapsulation en=new Encapsulation();
	en.find(23, "anusha");
	Anu a=new Anu();
	a.add(10, 6);
	
}
}

class Anu{
	 void add(int x,int y) {
		System.out.println(x+y);
		
	}
}