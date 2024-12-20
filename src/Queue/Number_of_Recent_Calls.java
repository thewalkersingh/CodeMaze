package Queue;
public class Number_of_Recent_Calls {
	private static final int[] records = new int[10000];
	private int start;
	private int end;
	
	public void RecentCounter() {
		start = 0;
		end = 0;
	}
	
	public int ping(int t) {
		while (start < end && (t - records[start] > 3000)) {
			start++;
		}
		records[end++] = t;
		return end - start;
	}
}