package ArrayAndString;
public class Can_Place_Flowers {
	public static void main(String[] args) {
		int[] flowerbed = {1, 0, 1, 0, 1, 0, 1};
		int n = 2;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int i = 0, count = 1;
		while (i < flowerbed.length) {
			if (n == 0) {
				return true;
			}
			if (flowerbed[i] == 0) {
				count++;
				if (count == 3) {
					n--;
					count = 1;
				}
			}
			else {
				count = 0; // reset count if we find a flower planted
			}
			i++;
		}
		// check if we can plant at the edge (right)
		if (count == 2) {
			n--;
		}
		return n == 0;
	}
}