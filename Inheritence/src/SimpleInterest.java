import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter price");
	int price = sc.nextInt();
	System.out.println("enter time");
	String Time = sc.next();
	System.out.println("enter Rate");
	int Rate = sc.nextInt();
	
	int result = (price*Integer.valueOf(Time)*Rate)/100;
	System.out.println(result);
}
}
