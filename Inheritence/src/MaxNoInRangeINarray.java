public class MaxNoInRangeINarray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 55, 100,99, 7 };

		System.out.println(range(arr, 0, 5));
	}

	static int range(int arr[], int start, int end) {
		int max = arr[start];
		int second=arr[start];
		for (int i = start; i < end; i++) {
			if (arr[i] > max) {
				second=max;
				max = arr[i];

			}
			else if(arr[i]>second) {
				second=arr[i];
			}
			
		}
		System.out.println("the second maxelement " +second);
		return max;
		
	}
}
