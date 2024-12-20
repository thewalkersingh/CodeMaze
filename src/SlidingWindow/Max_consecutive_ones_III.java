package SlidingWindow;
public class Max_consecutive_ones_III {
	public static void main(String[] args) {
//		int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
//		int k = 2;
//		Explanation: [1,1,1,0,0,1,1,1,1,1,1]
		int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
		int k = 3; //   Output:	10
		System.out.println(longestOnes(nums, k));
	}
	
	public static int longestOnes(int[] nums, int k) {
		int maxLength = 0, left = 0, right = 0, zeroCount = 0;
		while (right < nums.length) {
			if (nums[right] == 0)
				zeroCount++;
			while (zeroCount > k) {
				if (nums[left] == 0)
					zeroCount--;
				left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
			right++;
		}
		return maxLength;
	}
}