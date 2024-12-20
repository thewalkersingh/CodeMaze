package ArrayAndString;
public class GCD_Of_Strings {
	public static void main(String[] args) {
		String str1 = "ABCABC", str2 = "ABC"; //AB
		System.out.println(gcdOfStrings(str1, str2));
	}
	
	public static String gcdOfStrings(String str1, String str2) {
		if ((str1 + str2).equals(str2 + str1)) {
			int subLen = gcd(str1.length(), str2.length());
			return str1.substring(0, subLen);
		}
		else
			return "";
	}
	
	private static int gcd(int a, int b) {
		int min = Math.min(a, b);
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (a%i == 0 && b%i == 0)
				gcd = i;
		}
		return gcd;
	}
}