public class ReverseOfString {

	static void reverse(String str) {

		char[] c = str.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.println(c[i]);
		}
	}

	public static void main(String[] args) {
		reverse("anjammaanu");

		/*
		 * String str="anushaji"; char[] c=str.toCharArray(); for(int
		 * i=c.length-1;i>=0;i--) { System.out.println(c[i]); }
		 */

		// using StringBuilder
		String st = "raghavamma";
		StringBuilder str = new StringBuilder(st);
		str.reverse();
		System.out.println(str);

		// using StringBuffer

		String stri = "anajli";
		StringBuffer sb = new StringBuffer(stri);

		sb.reverse();
		System.out.println(sb);

	}
}
