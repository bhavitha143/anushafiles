import java.util.Scanner;

public class Even {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter n value");
	int num = sc.nextInt();
	if(num%2==0) {
		System.out.println("the given num is even" +num);
	}
	else
		System.out.println("the given num is odd" +num);
		
}
}
