package ArrayAndString;
public class Continues_One_Segment {
	public static void main(String[] args) {
		String s = "1011000";
		System.out.println(oneSegment(s));
	}
	
	public static boolean oneSegment(String str) {
		if (str.length() < 2 && str.charAt(0) == '1') {
			return true;
		}
		int prev;
		int curr;
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			prev = str.charAt(i - 1);
			curr = str.charAt(i);
			if (prev != curr)
				count++;
		}
		return count <= 1;
	}
}