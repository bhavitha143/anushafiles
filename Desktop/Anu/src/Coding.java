
public class Coding {

	private static int[] check(int a[], int target) {
		
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] + a[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[0];

	}

	public static void main(String[] args) {

		// input [2,7,11,15]

		int a[] = { 2, 7, 11, 15 };

		int target = 24;
		int[] result = check(a, target);
		for (int index : result) {
			System.out.println(index + " ");
		}

	}

}
