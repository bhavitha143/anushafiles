import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter r value");

		int r = sc.nextInt();
		float pi = 3.14f;
		float a = pi * (r * r);
		System.out.println(a);

	}
}
