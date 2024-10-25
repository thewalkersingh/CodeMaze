package arraysAndHashing;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
	public static void main(String[] args) {
		String[][] board = new String[][]{{"1", "2", ".", ".", "3", ".", ".", ".", "."},
		                                  {"4", ".", ".", "5", ".", ".", ".", ".", "."},
		                                  {".", "9", "1", ".", ".", ".", ".", ".", "3"},
		                                  {"5", ".", ".", ".", "6", ".", ".", ".", "4"},
		                                  {".", ".", ".", "8", ".", "3", ".", ".", "5"},
		                                  {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
		                                  {".", ".", ".", ".", ".", ".", "2", ".", "."},
		                                  {".", ".", ".", "4", "1", "9", ".", ".", "8"},
		                                  {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");
		System.out.println(isValidSudoku(board));
	}
	
	public static boolean isValidSudoku(String[][] board) {
		Map<Integer, Set<String>> cols = new HashMap<>();
		Map<Integer, Set<String>> rows = new HashMap<>();
		Map<Integer, Set<String>> squares = new HashMap<>();  // key = (r / 3) * 3 + c / 3
		
		for (int r = 0; r < 9; r++) {
			for (int c = 0; c < 9; c++) {
				String cell = board[r][c];
				if (cell == ".") {
					continue;
				}
				if (rows.getOrDefault(r, new HashSet<>()).contains(cell)
				    || cols.getOrDefault(c, new HashSet<>()).contains(cell)
				    || squares.getOrDefault((r/3)*3 + c/3, new HashSet<>()).contains(cell)) {
					return false;
				}
				cols.computeIfAbsent(c, k -> new HashSet<>()).add(cell);
				rows.computeIfAbsent(r, k -> new HashSet<>()).add(cell);
				squares.computeIfAbsent((r/3)*3 + c/3, k -> new HashSet<>()).add(cell);
			}
		}
		return true;
	}
}