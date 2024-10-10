package arraysAndHashing;
import java.util.*;

public class TopKElementsInList {
	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5};
		int k = 2;
		for (int nu : topKFrequent(nums, k))
			System.out.println(nu);
	}
	
	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> count = new HashMap<>();
		List<Integer>[] freqBucket = new List[nums.length + 1];
		//creating the key-freq map
		for (int num : nums)
			count.put(num, count.getOrDefault(num, 0) + 1);
		// creating empty bucket array
		for (int i = 0; i < freqBucket.length; i++) {
			freqBucket[i] = new ArrayList<>();
		}
		// now population the empty bucket with frequency
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			freqBucket[entry.getValue()].add(entry.getKey());
			System.out.println(freqBucket[entry.getValue()] + " " + freqBucket[entry.getKey()]);
		}
		int[] res = new int[k];
		int innerIndex = 0;
		for (int i = freqBucket.length - 1; i > 0 && innerIndex < k; i--) {
			for (int each : freqBucket[i]) {
				res[innerIndex++] = each;
				if (innerIndex == k)
					return res;
			}
		}
		return res;
	}
	
	public static int[] topKFrequent2(int[] nums, int k) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int num : nums) {
			count.put(num, count.getOrDefault(num, 0) + 1);
		}
		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			heap.offer(new int[]{entry.getValue(), entry.getKey()});
			if (heap.size() > k) {
				heap.poll();
			}
		}
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = heap.poll()[1];
		}
		return res;
	}
	
	public static int[] topKFrequent3(int[] nums, int k) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int num : nums) {
			count.put(num, count.getOrDefault(num, 0) + 1);
		}
		
		List<int[]> arr = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			arr.add(new int[]{entry.getValue(), entry.getKey()});
		}
		arr.sort((a, b) -> b[0] - a[0]);
		
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = arr.get(i)[1];
		}
		return res;
	}
}