
public class FindMissingNumInArray {

	public static void main(String[] args) {

		// duplicated numbers are not allowed
		// range from 1 to N
		// array is not sorted order
		// we have with sorted also without sort also

		int a[] = { 1, 2, 3, 4, 5, 6,7, 8, 9 };
		int n = a.length + 1;
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
		}

		System.out.println("the missing element in the array is " + sum);
	}

}
