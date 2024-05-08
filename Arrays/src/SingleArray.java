
public class SingleArray {

	public static void main(String[] args) {
		
		int a [] =new int [5];
		a[0]=1; a[1]=10; a[2]=30;a[3]=14;a[4]=19;
		
		/*// using for loop
		for(int i=0 ; i < a.length ;i++ ) {
			System.out.println(a[i]);
		}*/
		
		// using for each loop
		
		for(int d:a) {
			System.out.println(d);
		}
	}
}
