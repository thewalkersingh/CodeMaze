package Recursion;
public class Keypad_combination {
	public static void main(String[] args) {
		int n = 23;
		for (String h : keypad(n))
			System.out.println(h);
	}
	
	public static String[] keypad(int n) {
		if (n == 0) {
			return new String[]{""};
		}
		int lastDigit = n%10;
		String[] smallOutput = keypad(n/10);
		String ch = getChars(lastDigit);
		String[] output = new String[smallOutput.length*ch.length()];
		int start = 0;
		for (String s : smallOutput) {
			for (int j = 0; j < ch.length(); j++) {
				output[start] = s + ch.charAt(j);
				start++;
			}
		}
		return output;
	}
	
	public static String getChars(int n) {
		String[] chars = {" ", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		return chars[n];
	}
}