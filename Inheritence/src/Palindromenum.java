import java.util.Scanner;

public class Palindromenum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		int rev = 0, temp;
		temp = n;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}

		if (temp == rev) {
			System.out.println("given num is palindrome" + n);
		} else {
			System.out.println("given num is not palindrome" + n);

		}
	}
}
