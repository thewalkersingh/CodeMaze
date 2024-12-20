package TwoPointers;
public class Is_Subsequence {
	public static void main(String[] args) {
		String longer = "ahbgdc";
		String shorter = "ahc";
		System.out.println(isSubsequence(shorter, longer));
	}
	
	public static boolean isSubsequence(String s, String t) {
		if (s.length() > t.length())
			return false;
		if (s.isEmpty() || s.isBlank())
			return true;
		int shortIndex = 0, longIndex = 0;
		int smallLength = s.length();
		while (shortIndex < s.length() && longIndex < t.length()) {
			if (s.charAt(shortIndex) != t.charAt(longIndex)) {
				longIndex++;
			}
			else {
				shortIndex++;
				longIndex++;
				smallLength--;
			}
		}
		return smallLength == 0;
	}
}
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a
 subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 */