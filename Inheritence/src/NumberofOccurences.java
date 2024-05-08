import java.util.HashMap;
import java.util.Map.Entry;

public class NumberofOccurences {
	
	static	void occurence(String str) {
		
		HashMap<Character, Integer> hs=new HashMap<>();
		char[] c=str.toCharArray();
		for(char cha:c) {
			if(hs.get(cha)!=null) {
				hs.put(cha, hs.get(cha)+1);
			}
			else {
			hs.put(cha, 1);
			
		}
			
		}
		System.out.println(hs);
	
		for (Entry<Character, Integer> anu :hs.entrySet()) {
			if (anu.getValue() > 1) {
				System.out.println(anu);
			}
		}
			
	}
	
	public static void main(String[] args) {
	occurence("123456213");
	}
}
