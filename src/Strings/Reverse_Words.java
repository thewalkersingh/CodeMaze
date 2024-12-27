package Strings;
public class Reverse_Words {
	public static void main(String[] args) {
//		String s = "the sky is blue";        //Output: "blue is sky the"
		String s = "  hello world  ";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
		if (s.length() < 2)
			return s;
		String[] words = s.split("\\s+");
		int start = 0;
		int end = words.length - 1;
		while (start < end) {
			String temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start++;
			end--;
		}
		return String.join(" ", words).trim();
	}
}