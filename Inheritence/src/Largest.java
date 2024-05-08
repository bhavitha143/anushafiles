import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int value = sc.nextInt();
		System.out.println("enter value1");
		int value1 = sc.nextInt();
		if(value>value1) {
			System.out.println("bigger one is value"+ " " +value);
		}
		else 
			System.out.println("bigger one is value1" + " " + value1);
	}
}
