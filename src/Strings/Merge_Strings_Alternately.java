package Strings;
public class Merge_Strings_Alternately {
	public static void main(String[] args) {
		String word1 = "ab";
		String word2 = "pqrst";
		System.out.println(mergeAlternately(word1, word2));
	}
	
	public static String mergeAlternately(String word1, String word2) {
		int smallest = Math.min(word1.length(), word2.length());
		StringBuilder sb = new StringBuilder();
		System.out.println(word1.length());
		System.out.println(word2.length());
		int i = 0;
		while (i < word1.length()) {
			sb.append(word1.charAt(i));
			sb.append(word2.charAt(i));
			i++;
		}
		sb.append(word1.substring(i));
		sb.append(word2.substring(i));
		return sb.toString();
	}
}