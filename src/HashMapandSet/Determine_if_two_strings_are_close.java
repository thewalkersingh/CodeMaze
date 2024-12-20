package HashMapandSet;
import java.util.*;

public class Determine_if_two_strings_are_close {
	public static void main(String[] args) {
		String word1 = "cabbba";
		String word2 = "abbccc";
//		System.out.println(closeStrings(word1, word2));
		System.out.println(closeStrings2(word1, word2));
	}
	
	public static boolean closeStrings(String word1, String word2) {
		if (word2.length() != word1.length())
			return false;
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < word1.length(); i++) {
			map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
		}
		for (int i = 0; i < word2.length(); i++) {
			map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
		}
		System.out.println(map1);
		System.out.println(map2);
		for (int i = 0; i < word2.length(); i++) {
			if (!map1.containsKey(word2.charAt(i)))
				return false;
		}
		Integer[] freq1 = map1.values().toArray(new Integer[0]);
		Integer[] freq2 = map2.values().toArray(new Integer[0]);
		Arrays.sort(freq1);
		Arrays.sort(freq2);
		for (int i = 0; i < freq1.length; i++) {
			if (!Objects.equals(freq1[i], freq2[i]))
				return false;
		}
		return true;
	}
	
	public static boolean closeStrings2(String word1, String word2) {
		if (word1.length() != word2.length())
			return false;
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		for (char c : word1.toCharArray()) {
			freq1[c - 'a']++;
			set1.add(c);
		}
		for (char c : word2.toCharArray()) {
			freq2[c - 'a']++;
			set2.add(c);
		}
		Arrays.sort(freq1);
		Arrays.sort(freq2);
		return set1.equals(set2) && Arrays.equals(freq1, freq2);
	}
	
	public static boolean closeStrings3(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		if (word1.equals(word2))
			return true;
		int n = word1.length();
		int[] freq1 = new int['z' + 1];
		int[] freq2 = new int['z' + 1];
		byte[] w = new byte[n];
		word1.getBytes(0, n, w, 0);
		for (byte c : w)
			freq1[c]++;
		word2.getBytes(0, n, w, 0);
		for (byte c : w)
			freq2[c]++;
		for (int i = 'a'; i <= 'z'; i++)
			if (freq1[i] == 0 ^ freq2[i] == 0)
				return false;
		freq1['a' - 1] = -1;
		for (int i, k = 'a'; ++k <= 'z'; ) {
			int f1i = freq1[i = k];
			while (f1i < freq1[--i])
				freq1[i + 1] = freq1[i];
			freq1[i + 1] = f1i;
		}
		freq2['a' - 1] = -1;
		for (int i, k = 'a'; ++k <= 'z'; ) {
			int f2i = freq2[i = k];
			while (f2i < freq2[--i])
				freq2[i + 1] = freq2[i];
			freq2[i + 1] = f2i;
		}
		for (int i = 'a'; i <= 'z'; i++)
			if (freq1[i] != freq2[i])
				return false;
		return true;
	}
}