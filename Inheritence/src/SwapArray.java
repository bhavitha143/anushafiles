import java.util.Arrays;

public class SwapArray {

	static void swap(int arr[], int index1, int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5};
		swap(a,0,4);
		System.out.println(Arrays.toString(a));
	}
}
