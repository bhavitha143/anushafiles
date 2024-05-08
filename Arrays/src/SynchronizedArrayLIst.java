import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SynchronizedArrayLIst {
public static void main(String[] args) {
	
	ArrayList<String> list=new ArrayList<>();
	
	list.add("java");
	list.add("spring");
	
	//Collections.synchronizedList(list);
	//./0System.out.println(list);
	
	
	synchronized (list) {
		Iterator<String> it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
	}
}
}
