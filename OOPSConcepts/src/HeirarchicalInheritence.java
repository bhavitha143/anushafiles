class Animal{
	void eating() {
		System.out.println("i am eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
	
}
class Bird extends Animal{
	
	void fly() {
		System.out.println("bird is flying");
	}
	
}
public class HeirarchicalInheritence {
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eating();
		
		Bird b=new Bird();
		b.fly();
		b.eating();
		
		
	}

}
