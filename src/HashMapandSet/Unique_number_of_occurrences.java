package HashMapandSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Unique_number_of_occurrences {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 1, 1, 3};
//		int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
		System.out.println(uniqueOccurrences(arr));
	}
	
	public static boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> freq = new HashMap<>();
		
		for (int i : arr) {
			freq.put(i, freq.getOrDefault(i, 0) + 1);
		}
		if (freq.size() == 1)
			return true;
		Integer[] freqToArr = freq.values().toArray(new Integer[0]);
		Arrays.sort(freqToArr);
		int lastValue = freqToArr[0];
		for (int i = 1; i <= freqToArr.length - 1; i++) {
			if (lastValue == freqToArr[i])
				return false;
			lastValue = freqToArr[i];
		}
		return true;
	}
}