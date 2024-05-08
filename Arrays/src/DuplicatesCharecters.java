import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatesCharecters {

	static void findDuplicateChar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] cha = str.toCharArray();

		for (char c : cha) {
			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Entry<Character, Integer> anu : map.entrySet()) {
			if (anu.getValue() > 1) {
				System.out.println(anu);
			}
		}
	}

	public static void main(String[] args) {

		findDuplicateChar("welcometojava");

	}
}
