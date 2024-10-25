package arraysAndHashing;
public class ProductsOfArrayDiscludingSelf {
	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 6};
		int[] nums2 = {-1, 0, 1, 2, 3};
		for (int n : productExceptSelf2(nums2))
			System.out.print(n + " ");
//		System.out.println(product(nums));
//		System.out.println(4/1);
	}
	
	public static int[] productExceptSelf(int[] nums) {
		
		int[] ans = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			int multi = 1;
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;
				multi = multi*nums[j];
				ans[i] = multi;
			}
		}
		return ans;
	}
	
	public static int[] productExceptSelf2(int[] nums) {
		int pre = 1;
		int[] ans = new int[nums.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = pre;
			pre = pre*nums[i];
		}
		int post = 1;
		
		for (int i = ans.length - 1; i >= 0; i--) {
			ans[i] = ans[i]*post;
			post = post*nums[i];
		}
		return ans;
	}
}