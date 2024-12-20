package Matrix;
public class SetMatrixZero {
	public static void main(String[] args) {
		int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		int[][] ans = setZeros(matrix);
		
		for (int m = 0; m < ans.length; m++) {
			for (int n = 0; n < ans[m].length; n++) {
				System.out.print(ans[m][n] + " ");
			}
			System.out.println();
		}
//		System.out.println(matrix[2].length);
		// run kr k dekhte hai isse
		
	}
	
	public static int[][] setZeros(int[][] matrix) {
		// Write your code here..
		for (int m = 0; m < matrix.length; m++) {
			for (int n = 0; n < matrix[m].length; n++) {
				if (matrix[m][n] == 0) {
					matrix[m][n] = -1;
					markRow(matrix, m);
					markCol(matrix, n);
				}
			}
		}
		
		// finally replace -1 to zero
		for (int m = 0; m < matrix.length; m++) {
			for (int n = 0; n < matrix[m].length; n++) {
				if (matrix[m][n] == -1) {
					matrix[m][n] = 0;
				}
			}
		}
		return matrix;
	}
	
	public static void markRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[row].length; j++) {
			if (matrix[row][j] != 0)
				matrix[row][j] = -1;
		}
	}
	
	public static void markCol(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] != 0)
				matrix[i][col] = -1;
		}
	}
}