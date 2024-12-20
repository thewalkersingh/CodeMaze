package SlidingWindow;
public class Longest_subarray_of_1_after_deleting_one_element {
	public static void main(String[] args) {
		int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
//		int[] nums = {1, 1, 0, 1};
//		int[] nums = {1, 1, 1, 1};
		System.out.println(longestSubarray(nums));
	}
	
	public static int longestSubarray(int[] nums) {
		int zeroCount = 0;
		int left = 0;
		int count = 0;
		for (int right = 0; right < nums.length; right++) {
			if (nums[right] == 0)
				zeroCount++;
			
			while (zeroCount == 2) {
				if (nums[left] == 0) {
					zeroCount--;
				}
				left++;
			}
			
			count = Math.max(count, right - left);
		}
		return count;
	}
}