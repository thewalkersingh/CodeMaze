package arraysAndHashing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
		String s = "racecar", t = "carrace";
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t) {
		// racecar
		if (s.length() != t.length())
			return false;
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		Arrays.sort(sChars);
		Arrays.sort(tChars);
		return Arrays.equals(sChars, tChars);
	}
	
	public static boolean isAnagram2(String s, String t) {
		if (s.length() != t.length())
			return false;
		Map<Character, Integer> sCount = new HashMap<>();
		Map<Character, Integer> tCount = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int i = 0; i < t.length(); i++) {
			tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
		}
		return sCount.equals(tCount);
	}
	
	public static boolean isAnagram3(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
			arr[t.charAt(i) - 'a']--;
		}
		for (int val : arr) {
			if (val != 0)
				return false;
		}
		return true;
	}
}