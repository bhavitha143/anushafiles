
//printing reverse of integer

//step 1 = num greaterthan zero
//step 2 == num is modulo by ten and store  it new variable =rem
//step3  multiply withe ten and add rem
//step4 divided by ten 


public class ReverseOfInteger {
	
	public static void main(String[] args) {
		
		int num=123456, rem,rev=0;
		
		
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverse of given num is " +rev);
		// using  StringBuffer
		
		
		
		int number=1236756987;
		StringBuilder br=new StringBuilder(String.valueOf(number)).reverse();
		System.out.println(br);
		System.out.println(new StringBuffer(String.valueOf(number)).reverse());
		
	}
	
	
	

}
