package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintDuplicates {
	static void printDups(String str) {
		Map<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (count.containsKey(str.charAt(i)))
				count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
			else
				count.put(str.charAt(i), 1);
		}

		for (Entry<Character, Integer> countdup : count.entrySet()) {
			if (countdup.getValue() > 1)
				System.out.println(countdup.getKey() + ", count = " + countdup.getValue());
		}
	}
/*
	static void fillCharCounts(String str, int[] count) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}
	static void printDups(String s) {
		int count[] = new int[26];
		fillCharCounts(str, count);

		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.println((char) (i) + ", count = " + count[i]);
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test string";
		printDups(str);
	}

}
