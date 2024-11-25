package arraysAndHashing;
import java.util.HashMap;

public class TwoIntegerSum {
	public static void main(String[] args) {
		int[] nums = {3, 4, 5, 6};
		int target = 9;
		for (int i : twoSum2(nums, target))
			System.out.print(i + " ");
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target && i != j) {
					ans[0] = j;
					ans[1] = i;
					break;
				}
			}
		}
		return ans;
	}
	
	public static int[] twoSum2(int[] nums, int target) {
		HashMap<Integer, Integer> previous = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int number = nums[i];
			int diff = target - number;
			if (previous.containsKey(diff)) {
				return new int[]{previous.get(diff), i};
			}
			previous.put(number, i);
		}
		return new int[]{};
	}
}