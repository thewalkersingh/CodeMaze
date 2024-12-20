package TwoPointers;
import java.util.Arrays;

public class Move_Zeroes {
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
//		int[] nums = {0};
		for (int n : moveZeroes2(nums))
			System.out.println(n);
	}
	
	public static int[] moveZeroes(int[] nums) {
		Arrays.sort(nums);
		int slow = 0;
		int fast = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				fast++;
			else {
				int temp = nums[slow];
				nums[slow] = nums[fast];
				nums[fast] = temp;
				fast++;
				slow++;
			}
		}
		return nums;
	}
	
	public static int[] moveZeroes2(int[] nums) {
		int[] ans = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				ans[j] = nums[i];
				j++;
			}
		}
		while (j < nums.length) {
			ans[j] = 0;
			j++;
		}
		return ans;
	}
}