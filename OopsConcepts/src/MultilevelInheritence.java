class Add{
	int x, y ;
	int  add(int x, int y) {
		this.x= x;
		this.y=y;
		return (x + y) ;
	}}

	
	class Sub extends   Add{
		Sub(int x, int y){
			super.x=x;
			super.y=y;
		}
}
public class MultilevelInheritence  extends Sub{

	MultilevelInheritence(int x, int y) {
		super(x, y);
		System.out.println(x-y);
	}
	
	public static void main(String[] args) {
		
	
	MultilevelInheritence c =new MultilevelInheritence(15 ,10);
     System.out.println(c.add(15, 10));
	}
}