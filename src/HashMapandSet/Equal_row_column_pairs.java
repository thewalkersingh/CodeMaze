package HashMapandSet;
import java.util.ArrayList;
import java.util.List;

public class Equal_row_column_pairs {
	public static void main(String[] args) {
//		int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
		int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
//		for (int i = 0; i < grid[0].length; i++) {
//			System.out.print(grid[1][i]);
//		}
//		System.out.println(" Length: " + grid.length);
		System.out.println(equalPairs(grid));
	}
	
	public static int equalPairs(int[][] grid) {
		int matchCount = 0;
//		System.out.print(grid.length);
		int start = 0;
		while (start < grid.length) {
			List<Integer> row = new ArrayList<>();
			for (int i = 0; i < grid[start].length; i++) {
				row.add(grid[i][start]);
			}
			for (int r = 0; r < grid.length; r++) {
				List<Integer> col = new ArrayList<>();
				for (int c = 0; c < grid.length; c++) {
					col.add(grid[r][c]);
				}
				if (row.equals(col))
					matchCount++;
				col.clear();
			}
			row.clear();
			start++;
		}
		return matchCount;
	}
}