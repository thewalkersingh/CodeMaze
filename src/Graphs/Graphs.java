package Graphs;
import java.util.Scanner;

public class Graphs {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int e = sc.nextInt();
	  int adjMatrix[][] = new int[n][n];
	  for (int i = 0; i < e; i++) {
		 int v1 = sc.nextInt();
		 int v2 = sc.nextInt();
		 adjMatrix[v1][v2] = 1;
		 adjMatrix[v2][v1] = 1;
	  }
	  for (int[] matrix : adjMatrix) {
		 for (int j = 0; j < n; j++) {
			System.out.print(matrix[j] + " ");
		 }
		 System.out.println("--");
	  }
   }
   
   public static void dfTraversal(int[][] adjMatrix) {
	  
   }
}