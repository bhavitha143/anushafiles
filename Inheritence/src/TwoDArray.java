import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input  value");
		
		int arr[][]=new int[3][3];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col< arr[row].length;col++) {
				arr[row][col]=sc.nextInt();
				System.out.print(arr[row][col]);
			}
			System.out.println();

			/*for(int[] a:arr) {
				System.out.print(Arrays.toString(a));
			
			}
			System.out.println();
			}*/
		
		
			/*
			 * for(int row=0;row<arr.length;row++) { for(int col=0;col<
			 * arr[row].length;col++) {
			 * 
			 * System.out.print(arr[row][col]); } System.out.println(); }
			 */
		
	}
}
}
