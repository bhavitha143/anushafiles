
public class MultiDimenstional {

	public static void main(String[] args) {

		int a[][] = new int[2][2];

		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;

		/*
		 * // using for each loop for (int[] d : a) { for (int y : d) {
		 * System.out.print(y); } System.out.println(); }
		 */

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= j+1;
			System.out.print(a[i][j] + " ");
		}
			System.out.println();
		}

	}
}
