import java.util.Scanner;

public class UserX {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter n value");
		int sum = 0;
		while (true) {
			
			int n = sc.nextInt();
			
			sum = sum + n;
			
			if (n == 'X' || n == 'x') {
				break;

			}
			else if(n=='o'|| n=='O') {
				break;
			}
			
			System.out.println("the sum of given inputs " + sum);
		}

	}

}
