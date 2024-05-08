import java.util.Scanner;

public class CurrencyToUsd {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter price value");
	int price = sc.nextInt();
	float dolar= 83.14f;
	float re=(price*dolar);
	System.out.println(re);
	
}
}
