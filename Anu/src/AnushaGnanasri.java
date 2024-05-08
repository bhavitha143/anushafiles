import java.util.HashSet;
import java.util.Iterator;

public class AnushaGnanasri {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 7,7,3 };
		
		//remove duplicate numbers from an array

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length - 1; i++) {

			hs.add(a[i]);

		}
		
		Iterator<Integer> it =hs.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}
}