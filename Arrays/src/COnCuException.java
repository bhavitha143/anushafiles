import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class COnCuException {

	
	
	public static void main(String[] args) {
	
		
		ArrayList<String> tempList=new ArrayList<>();
		tempList.add("ganesha");
		tempList.add("lambodhara");
		tempList.add("vakrathundaya");
		tempList.add("parvathithanayaya");
		tempList.add("balachandraya");
		
		for(String temp:tempList) {
			System.out.println(temp);
			tempList.add("balachandraya");
			//tempList.remove(3);
		}
		Collections.sort(tempList);
		System.out.println("after adding one more element" +tempList);
	}
}
