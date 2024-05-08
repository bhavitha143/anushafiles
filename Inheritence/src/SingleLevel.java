
class Student{
	
	int x; int y;
	int add(int x, int y) {
		 int  c=  x+y; 
		return c;
		
	}
	
	
	
}


 class SingleLevel extends Student {
	
	public static void main(String[] args) {
		SingleLevel s=new SingleLevel();
		//s.add(14, 12);
		
		System.out.println("dis is addition" +"  " + s.add(11, 10));
	}

}
