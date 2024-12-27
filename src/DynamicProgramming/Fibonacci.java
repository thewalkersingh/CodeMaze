package DynamicProgramming;
import java.util.ArrayList;

public class Fibonacci {
	static ArrayList<Integer> dp;
	
	public static void main(String[] args) {
		dp = new ArrayList<>();
		for (int i = 0; i <= 15; i++) {
			dp.add(-1);
		}
		int ans = fib2(12);
		System.out.println("Fib: " + ans);
	}
	
	// using memoization (top-down approach)
	public static int fib(int n) {
		if (n <= 1)
			return n;
		if (dp.get(n) != -1)
			return dp.get(n);
		int temp = fib(n - 1) + fib(n - 2);
		dp.set(n, temp);
		return temp;
	}
	
	// using tabulation (bottom-up approach)
	public static int fib2(int n) {
		dp.set(0, 0);
		dp.set(1, 1);
		for (int i = 2; i <= n; i++) {
			dp.set(i, dp.get(i - 1) + dp.get(i - 2));
		}
		return dp.get(n);
	}
}