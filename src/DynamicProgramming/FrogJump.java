package DynamicProgramming;
import java.util.Arrays;

public class FrogJump {
   static int[] dp;
   
   public static void main(String[] args) {
	  dp = new int[5];
	  Arrays.fill(dp, -1);
	  int[] heights = {10, 20, 30, 10};
	  int ans = tabulation(heights, 4);
	  System.out.println("Min energy " + ans);
   }
   
   public static int memoization(int[] heights, int n) {
	  // base condition
	  if (n == 1)
		 return 0;
	  
	  // do we have calculated this value
	  if (dp[n] != -1)
		 return dp[n];
	  
	  // choices
	  int option1 = 0, option2 = Integer.MAX_VALUE;
	  option1 = Math.abs(heights[n - 1] - heights[n - 2]) + memoization(heights, n - 1);
	  if (n - 2 > 0) {
		 option2 = Math.abs(heights[n - 1] - heights[n - 3]) + memoization(heights, n - 2);
	  }
	  
	  // optimal
	  return dp[n] = Math.min(option1, option2);
   }
   
   public static int tabulation(int[] heights, int n) {
	  dp[0] = 0;
	  dp[1] = 0;
	  
	  for (int i = 2; i <= n; i++) {
		 int option1, option2 = Integer.MAX_VALUE;
		 option1 = Math.abs(heights[i - 1] - heights[i - 2]) + dp[i - 1];
		 if (i - 2 > 0) {
			option2 = Math.abs(heights[i - 1] - heights[i - 3]) + dp[i - 2];
		 }
		 dp[i] = Math.min(option1, option2);
	  }
	  return dp[n];
   }
}