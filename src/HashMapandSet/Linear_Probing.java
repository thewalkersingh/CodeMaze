package HashMapandSet;
import java.util.ArrayList;
import java.util.List;

public class Linear_Probing {
	public static void main(String[] args) {
//		int[] arr = {5, 3, 2, 6, 4};
		int[] arr = {1, 5, 3, 7};
		
		List<Integer> keys = new ArrayList<>();
		for (int i : arr)
			keys.add(i);
		
		for (int i : linearProbing(keys))
			System.out.print(i + " ");
	}
	
	public static int[] linearProbing(List<Integer> keys) {
		// Write your code here.
		int length = keys.size();
		int[] ans = new int[length];
		for (int value : keys) {
			int index = value%length;
			putElement(value, index, ans);
		}
		return ans;
	}
	
	public static void putElement(int value, int index, int[] ans) {
		boolean isPlaced = true;
		while (isPlaced) {
			if (ans[index] == 0) {
				ans[index] = value;
				isPlaced = false;
			}
			index = (index + 1)%ans.length;
		}
	}
}