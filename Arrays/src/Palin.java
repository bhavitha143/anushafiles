import java.util.Scanner;

public class Palin {
	public static void main(String[] args) {

		String reverse="",original;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the num");
		original=sc.nextLine();
		for(int i=original.length()-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("the given one is palindrome"+ " " + original);
		}
		else {
			System.out.println("the given one is  NOT palindrome" + original);
		}
	}
}
