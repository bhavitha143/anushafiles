
public class Ruthvik {
public static void main(String[] args) {
	

	// given input
	int[] input = { 1,2,4,5}; 
 int n=input.length+1;	
 int totalsum=n*(n+1)/2;
 for(int i=0;i<input.length;i++) {
	 totalsum=totalsum-input[i]; 
 }
 System.out.println("the missing number in array" +totalsum);
 
}

}
