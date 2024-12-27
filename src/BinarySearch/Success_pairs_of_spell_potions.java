package BinarySearch;
public class Success_pairs_of_spell_potions {
	public static void main(String[] args) {
		int[] spells = {3, 1, 2};
		int[] potions = {8, 5, 8};
		int success = 16;
		for (int i : successfulPairs(spells, potions, success))
			System.out.print(i + " ");
	}
	
	public static int[] successfulPairs(int[] spells, int[] potions, long success) {
		int[] ans = new int[spells.length];
		int successCount = 0;
		int ansIndex = 0;
		for (int spell : spells) {
			for (int potion : potions) {
				int value = spell*potion;
				System.out.print(value + " ");
				if (value >= success) {
					successCount++;
				}
			}
			System.out.println();
			ans[ansIndex++] = successCount;
			successCount = 0;
		}
		return ans;
	}
}