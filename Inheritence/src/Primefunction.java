
public class Primefunction {

	
	static void prime(int n) {
		int count=0;
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				count++;

			}
		}
			if (count == 0)
				System.out.println("the given no is prime" + n);
			else
				System.out.println("the given no is not  prime" + n);
		}
			

		
		
	
	public static void main(String[] args) {
		prime(15);
	}
	
}
