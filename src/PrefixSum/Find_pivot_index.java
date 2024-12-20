package PrefixSum;
public class Find_pivot_index {
	public static void main(String[] args) {
		int[] nums = {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}
	
	public static int pivotIndex(int[] nums) {
		int total = 0;
		for (int num : nums) {
			total = total + num;
		}
		int left = 0;
		for (int i = 0; i < nums.length; i++) {
			int right = total - left - nums[i];
			if (left == right)
				return i;
			left = left + nums[i];
		}
		return -1;
	}
}