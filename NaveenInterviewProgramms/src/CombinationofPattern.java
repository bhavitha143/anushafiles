
public class CombinationofPattern {
public static void main(String[] args) {
	
	
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*
  
	
	for(int rows=0;rows<5;rows++) {
		for(int col=0;col<=rows;col++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int rows=4;rows>=1;rows--) {
		for(int col=0;col<rows;col++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
