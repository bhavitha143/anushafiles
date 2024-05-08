class Ajitha{
	int div(int a, int b) {
		System.out.println("Ajitha class method");
		return a+b;
	}
}
	class Anjali extends  Ajitha{
		int div(int a, int b) {
			System.out.println("anjali class method");
			return a+b;
		}
}
public class InheritenceConcept  extends Anjali{
	public static void main(String[] args) {
		Ajitha ic =new  InheritenceConcept();
		ic.div(10, 17);
		System.out.println(ic);
	}

}
