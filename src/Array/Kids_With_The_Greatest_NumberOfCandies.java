package Array;
import java.util.ArrayList;
import java.util.List;

public class Kids_With_The_Greatest_NumberOfCandies {
	public static void main(String[] args) {
		int[] candies = {4,2,1,1,2};
		int extraCandies = 1;
		System.out.println(kidsWithCandies(candies, extraCandies));
	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int largest = 0;
		for (int i = 0; i < candies.length; i++) {
			largest = Math.max(candies[i], largest);
		}
		List<Boolean> ans = new ArrayList<>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= largest)
				ans.add(true);
			else
				ans.add(false);
		}
		return ans;
	}
}