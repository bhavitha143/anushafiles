import java.util.Scanner;

public class Fib {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter n  value");
	int n =sc.nextInt();
	int a=0,b=0,c=1;
	
	for(int i=0;i<=n;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println("the fibnacci series upto n" + " " +a);
	}
}
}
