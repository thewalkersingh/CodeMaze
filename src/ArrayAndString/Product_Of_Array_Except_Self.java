package ArrayAndString;
import java.util.Arrays;

public class Product_Of_Array_Except_Self {
	public static void main(String[] args) {
//		int[] nums = {1, 2, 3, 4};
		int[] nums = {-1, 1, 0, -3, 3};
		for (int n : productExceptSelf(nums))
			System.out.print(n + " ");
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int multi = 1;
		int zeroCount = 0;
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroCount++;
				continue;
			}
			multi = multi*nums[i];
		}
		System.out.println(multi + " " + zeroCount);
		if (zeroCount >= 2) {
			Arrays.fill(ans, 0);
			return ans;
		}
		if (zeroCount == 1) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 0)
					ans[i] = multi;
				else
					ans[i] = 0;
			}
			return ans;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				continue;
			ans[i] = multi/nums[i];
		}
		
		return ans;
	}
}