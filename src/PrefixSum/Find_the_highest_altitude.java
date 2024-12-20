package PrefixSum;
public class Find_the_highest_altitude {
	public static void main(String[] args) {
//		int[] gain = {-5, 1, 5, 0, -7};
//		int[] gain = {-4, -3, -2, -1, 4, 3, 2};
//		int[] gain = {52, -91, 72};
		int[] gain =
				{44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85, -39, 67, -63, 64,
				 -47, 95, 91, -40, 65, 67, 92, -28, 97, 100, 81};
		System.out.println(largestAltitude(gain));
	}
	
	public static int largestAltitude(int[] gain) {
		int[] prefix = new int[gain.length + 1];
		int max = 0;
		prefix[0] = 0;
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = gain[i - 1] + prefix[i - 1];
			max = Math.max(max, prefix[i]);
		}
		return max;
	}
}