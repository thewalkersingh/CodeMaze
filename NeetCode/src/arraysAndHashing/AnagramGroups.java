package arraysAndHashing;
import java.util.*;

public class AnagramGroups {
	public static void main(String[] args) {
		String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
		groupAnagrams(strs);
//		for (List<String> s : groupAnagrams(strs)) {
//			System.out.println(s);
//		}
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> rest = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] chars = strs[i].toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			rest.putIfAbsent(sorted, new ArrayList<>());
			System.out.println("Sorted string: " + sorted);
			rest.get(sorted).add(strs[i]);
			System.out.println("HM: " + rest.get(sorted));
		}
		return new ArrayList<>(rest.values());
	}
	
	public static List<List<String>> groupAnagrams2(String[] strs) {
		HashMap<String, List<String>> rest = new HashMap<>();
		for (String s : strs) {
			int[] countArray = new int[26];
			for (char c : s.toCharArray()) {
				countArray[c - 'a']++;
			}
			String key = Arrays.toString(countArray);
			rest.putIfAbsent(key, new ArrayList<>());
			rest.get(key).add(s);
		}
		return new ArrayList<>(rest.values());
	}
}