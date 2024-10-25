package TwoPointers;
import java.util.Arrays;

public class IsPalindrome {
	public static void main(String[] args) {
//		String s = "Was it a car or a cat I saw?";
//		String s = "tab a cat!";
		String s = "0P";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) - 'a' < 0)
				continue;
			sb.append(s.charAt(i));
		}
		if (sb.length() < 2 || sb.charAt(0) == ' ')
			return false;
		System.out.println(sb);
		int x = 0, y = sb.length() - 1;
		while (x <= y) {
			if (sb.charAt(x) != sb.charAt(y))
				return false;
			x++;
			y--;
		}
		return true;
	}
}