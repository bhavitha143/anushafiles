import java.util.Scanner;

public class ArmStrong {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter n value");
	int n = sc.nextInt();
	
	int sum=0;
	int temp =n;
	while(n>0) {
	int	rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
		
	}if(temp==sum){
		System.out.println("given no is armstrong " +n);
	}else {
		System.out.println("given no  is not armstrong  ");
	}
	
}
}
