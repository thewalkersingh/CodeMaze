package TwoPointers;
public class Container_with_most_water {
	public static void main(String[] args) {
//		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int[] height = {1, 1};
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
		int left = 0, right = height.length - 1;
		int max = 0;
		while (left < right) {
			int total = Math.min(height[left], height[right])*(right - left);
			max = Math.max(total, max);
			if (height[left] <= height[right])
				left++;
			else if (height[right] <= height[left])
				right--;
		}
		return max;
	}
}