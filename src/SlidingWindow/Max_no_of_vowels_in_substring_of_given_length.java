package SlidingWindow;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Max_no_of_vowels_in_substring_of_given_length {
	public static void main(String[] args) {
//		String s = "leetcode";
		String s = "abciiidef";
		int k = 3;
		System.out.println(maxVowels(s, k));
	}
	
	public static int maxVowels(String s, int k) {
		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (vowels.contains(s.charAt(i)))
				count++;
		}
		int max = count;
		for (int i = k; i < s.length(); i++) {
			if (vowels.contains(s.charAt(i - k)))
				count--;
			if (vowels.contains(s.charAt(i)))
				count++;
			max = Math.max(max, count);
		}
		return max;
	}
}