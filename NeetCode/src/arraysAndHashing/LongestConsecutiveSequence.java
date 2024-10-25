package arraysAndHashing;
import java.util.*;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
		System.out.println(longestConsecutive2(nums));
	}
	
	public static int longestConsecutive(int[] nums) {
		if (nums.length == 0)
			return 0;
		
		Set<Integer> set = new HashSet<>();
		for (int i : nums)
			set.add(i);
		int longest = 0;
		int currentCount = 0;
		Integer[] res = set.toArray(new Integer[0]);
		Arrays.sort(res);
		for (int i = 1; i < res.length; i++) {
			if (res[i] - res[i - 1] == 1) {
				currentCount++;
				longest = Math.max(longest, currentCount);
			}
			else
				currentCount = 0;
		}
		return longest + 1;
	}
	
	public static int longestConsecutive2(int[] nums) {
		Map<Integer, Integer> mp = new HashMap<>();
		int res = 0;
		
		for (int num : nums) {
			if (!mp.containsKey(num)) {
				mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
				System.out.println(mp.get(num));
				mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
				mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
				res = Math.max(res, mp.get(num));
			}
		}
		return res;
	}
}