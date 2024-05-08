import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int rev=0;
		/*
		 * while(num>0) { int rem =num%10; rev=rev*10+rem; num=num/10; }
		 */
		StringBuffer sb =new StringBuffer(String.valueOf(num)).reverse();
		
		
		System.out.println(sb);
		
	}

}
