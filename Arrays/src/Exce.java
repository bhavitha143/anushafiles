
public class Exce {
	public static void main(String[] args) {
		
		
		int a[]=new int [3];
		try {
			 a[0]=3;
			a[1]=3;
			a[2]=a[0]/a[1]	;
			System.out.println(a[2]);
			System.exit(1);
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("finally method called");
			
		}
	}

}
