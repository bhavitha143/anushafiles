import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();

		int count = 1;

		for (int i = 2; i <= num; i++) {
			if (num % i == 1) {
				count++;

			}
			break;
		}
			if (count == 2)
				System.out.println("the given no is prime" + num);
			else
				System.out.println("the given no is not  prime" + num);

		}
	}

