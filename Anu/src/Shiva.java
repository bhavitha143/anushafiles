import java.util.ArrayList;
import java.util.List;

public class Shiva {
	private static   String getName(String name) {
		name="anusha";
		System.out.println(name);
		return name;
	}
	
	
	public static void main(String[] args) {
		
		Shiva.getName("shiva");
	
	
	String str="   anusha    kolli 123   ";
	
	
	str=str.trim();
	System.out.println(str);
	StringBuffer st2=new StringBuffer(str);
	st2=st2.reverse();
	System.out.println(st2);
	
	StringBuilder st=new StringBuilder(str);
	st=st.reverse();
	System.out.println(st);
	String st1=str.replaceAll("\\s", "");
	System.out.println(st1);

}}
