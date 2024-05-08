import java.util.HashMap;
import java.util.Map.Entry;

public class WordsRepetationString {
	
	
	
	
	static void findDuplicateWord(String str) {
		
		HashMap<String, Integer> hm =new  HashMap<>();
		String[] s =str.split(" ");
		for(String tempString:s) {
			if(hm.get(tempString)!=null) {
				hm.put(tempString, hm.get(tempString)+1);
			}
			else {
			hm.put(tempString, 1);
		}
		}
		for(Entry<String,Integer>  entry  : hm.entrySet()){
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}
	
	public static void main(String[] args) {
		findDuplicateWord("java java i am am anusha " );
	}

}
