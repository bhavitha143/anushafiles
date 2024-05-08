import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		String rev="";
		String temp=str;
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+c[i];
			
		}
		if(temp.equalsIgnoreCase(rev)) {
			System.out.println("given one is palindrome" +rev);
		}
		else {
		System.out.println("not polindrome");
		
	}}

}
