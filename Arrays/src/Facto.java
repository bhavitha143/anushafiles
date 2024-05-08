
public class Facto {

	
	
	int fact(int n) {
		if(n==1)
			return 1;
	int x=	n*fact(n-1);
	return x;
	}
	
	
	
	public static void main(String[] args) {
		Facto f=new Facto();
		int z=f.fact(4);
		System.out.println(z);
	}
}
