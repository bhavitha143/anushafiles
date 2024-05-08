import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// remove duplicate num in array list using java 8
public class RemoveDuplicateNum {

	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,44,55,55,44,33,22,2,1));
	
	HashSet<Integer> hashLIst =new HashSet<>(list);
	
	//ArrayList<Integer> listWithOUtDuplicates =new ArrayList<>(hashLIst);
	System.out.println(hashLIst);
	}
	
}
