

/*class GeeksForGeeks {
 
    // Method
    void greeting()
    {
        // Print statement whenever method is called
        System.out.println("hello!");
    }
}*/

// It is an unchecked exception which a program throws when the requested class is not present at runtime. scq 2rG	V#!Y7
// it happens when GeeksForGeeks class is not avaliable at runtime  it is Unchecked Exception
public class NoClassDefFoundError {
	 public static void main(String args[])
	    {
	        // Creating object of class 1
	        // inside main() in class2
	        GeeksForGeeks geeks = new GeeksForGeeks();
	 
	        // Calling method of above class
	        geeks.greeting();
	    }
	}

