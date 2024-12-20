package TwoPointers;
import java.util.Arrays;

public class Max_number_of_k_Sum_pairs {
	public static void main(String[] args) {
//		int[] nums = {3, 1, 3, 4, 3};
//		int[] nums = {3, 2, 5, 2, 1, 3, 5, 4};
//		int[] nums = {1, 2, 3, 4};
		int[] nums = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
		int k = 2;
		System.out.println(maxOperations(nums, k));
	}
	
	public static int maxOperations(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= k)
				nums[i] = 0;
		}
		Arrays.sort(nums);
		int count = 0;
		int left = 0, right = nums.length - 1;
		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum == k) {
				count++;
				left++;
				right--;
			}
			else if (sum < k)
				left++;
			else
				right--;
		}
		return count;
	}
}