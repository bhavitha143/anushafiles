import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListLambda {

	public static void main(String[] args) {

		// print odd num using lambda function

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 4, 5, 19, 21, 23));

		list.removeIf(num -> (num % 2 == 1));
		System.out.println(list);
		
		ArrayList<String> listNames = new ArrayList<>(Arrays.asList("anusha","gnanasri","anil","anusha"));
		System.out.println(listNames);
		listNames.retainAll(Collections.singleton("anusha"));
		System.out.println(listNames);
	}
}
