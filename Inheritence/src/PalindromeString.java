import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String original = sc.nextLine();
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);

		}
		System.out.println("the reverse of string" +reverse);

		if (original.equalsIgnoreCase(reverse)) {
			System.out.println("the given one is palindrome" + " " + original);
		} else {
			System.out.println("the given one is  NOT palindrome" + original);
		}

	}
}
