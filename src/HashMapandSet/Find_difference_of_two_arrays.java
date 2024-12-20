package HashMapandSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_difference_of_two_arrays {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3};
		int[] nums2 = {2, 4, 6};
		for (List<Integer> ans : findDifference(nums1, nums2))
			for (int i : ans)
				System.out.print(i + " ");
		System.out.println();
	}
	
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (int i : nums1) {
			set1.add(i);
		}
		for (int i : nums2) {
			set2.add(i);
		}
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i : set1) {
			if (!set2.contains(i))
				list1.add(i);
		}
		for (int i : set2) {
			if (!set1.contains(i))
				list2.add(i);
		}
		List<List<Integer>> ans = new ArrayList<>();
		ans.add(list1);
		ans.add(list2);
		return ans;
	}
}