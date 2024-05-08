import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int result =0;int i=1;
		for(i=1;i<=10;i++) {
			result=n*i;
			//System.out.println("the multiplication if num is");
			System.out.println(  n+"*"+i+"="+ result);
		}
	
		
	}

}
