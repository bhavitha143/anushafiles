import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

		   
	    public static void fizzBuzz(int n) {
	for(int i=1;i<n;i++){
	   
	    if((i%3==0)&&(i%5==0)){
	        System.out.println("FizzBuzz");
	    }
	    else if((i%3==0)&&(i%5==1)){
	       System.out.println("Fizz"); 
	    }
	    else if((i%5==0)&&(i%3==1)){
	        System.out.println("Buzz");
	    }
	    else{
	        System.out.println(i);
	    }
	}
	    }

	}
	public class Ibm {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        Result.fizzBuzz(15);

	        bufferedReader.close();
	    }
	}


