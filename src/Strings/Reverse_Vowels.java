package Strings;
public class Reverse_Vowels {
	public static void main(String[] args) {
//		String s = "race a car";
		String s = "IceCreAm";
		System.out.println(reverseVowels(s));
	}
	
	public static String reverseVowels(String s) {
		String vowels = "aeiouAEIOU";
		char[] ans = s.toCharArray();
		int start = 0, end = ans.length - 1;
		while (start < end) {
			while (start < end && vowels.indexOf(ans[start]) == -1)
				start++;
			while (end > start && vowels.indexOf(ans[end]) == -1)
				end--;
			char temp = ans[start];
			ans[start] = ans[end];
			ans[end] = temp;
			start++;
			end--;
		}
		return new String(ans);
	}
}