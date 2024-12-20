package HashMapandSet;
import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 2, 3, 1, 6, 5, 2};
		ArrayList<Integer> output = removeDuplicates(arr);
		System.out.println(output);
	}
	
	public static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				continue;
			ans.add(arr[i]);
			map.put(arr[i], true);
		}
		return ans;
	}
}