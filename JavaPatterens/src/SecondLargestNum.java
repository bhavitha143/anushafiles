
public class SecondLargestNum {
	public static void main(String[] args) {
		
		int [] a = {12,14,606,99,112,5,999};
		
		int  max = a[0];
		 int large = a[0];
		 
		 int min =a[0];
		 for(int i=0;i<a.length;i++) {
			 
			if(a[i]>max) {
				large=max;
				max=a[i];
				
			}
			else if (a[i]>large) {
				large = a[i];
			
	}
			else if (a[i]<min) {
				min = a[i];
			
	
			}
	}
		 System.out.println("\n largest number is:" + max);
		 
		 System.out.println("\nSecond largest number is:" + large);
		 System.out.println("\n min number is:" + min);
		 
}
}
