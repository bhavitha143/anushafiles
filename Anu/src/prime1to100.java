public class prime1to100 {

	
	public static void main(String[] args) {
	
		
		for(int i=2;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
		
			if(count==2) {
			System.out.println("the prime numbers upto n :"+  i);
			
		}
		}
		
		
	}}
	
		