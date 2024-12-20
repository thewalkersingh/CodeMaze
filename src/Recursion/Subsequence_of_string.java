package Recursion;
public class Subsequence_of_string {
	public static void main(String[] args) {
		String s = "abc";
		for (String i : subsequence(s))
			System.out.print(i + " ");
	}
	
	public static String[] subsequence(String input) {
		if (input.isEmpty())
			return new String[]{""};
		String[] smallOutput = subsequence(input.substring(1));
		String[] output = new String[2*smallOutput.length];
		int i = 0;
		for (String s : smallOutput) {
			output[i++] = s;
			output[i++] = input.charAt(0) + s;
		}
		return output;
	}
}