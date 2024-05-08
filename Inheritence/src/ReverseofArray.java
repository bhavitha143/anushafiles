import java.util.Arrays;

public class ReverseofArray {

public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		reverse(a);
System.out.println(Arrays.toString(a));		
	}
	static void reverse(int arr[]) {
		int start =0;
		int end=arr.length-1;
		while(start<end) {
		swap(arr , start,end);
		start++;
		end--;
	}
	
	
	
}
	private static void swap(int[] arr, int index1, int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}
}
