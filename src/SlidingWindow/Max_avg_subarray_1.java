package SlidingWindow;
public class Max_avg_subarray_1 {
	public static void main(String[] args) {
		int[] nums = {1, 12, -5, -6, 50, 3};
		int k = 4;
//		int[] nums = {0, 1, 1, 3, 3}; int k=4;
//		int[] nums = {4, 0, 4, 3, 3};
//		int k = 5;
		System.out.println(findMaxAverage(nums, k));
	}
	
	public static double findMaxAverage(int[] nums, int k) {
		if (k > nums.length)
			return 0;
		if (nums.length == 1)
			return (double) nums[0]/k;
		double sum = 0.0;
		for (int i = 0; i < k; i++) {
			sum = sum + nums[i];
		}
		double max = sum;
		for (int i = k; i < nums.length; i++) {
			sum = sum + nums[i] - nums[i - k];
			max = Math.max(max, sum);
		}
		return max/k;
	}
}