
public class SwapStringWithoutUsingTemp {
	public static void main(String[] args) {

		String a = "anusha";
		String b = "Shiva";
		System.out.println("before swapping  " + "" + a + " " + b);

	a=a+b;
	System.out.println("total length of  string is " +a);
	b=a.substring(0,a.length()- b.length());
	a=a.substring(b.length());
	System.out.println("after swapping a is " +  " "+a);
	System.out.println("after swapping b is " + " " +b); 
	}
}
