package Trees;
import java.util.Scanner;

public class Tree {
	Scanner scanner = new Scanner(System.in);

//	public void add(int num) {
//		TreeNode t = new TreeNode(num);
//	}
	
	public void print(TreeNode root) {
		if (root.child == null) {
			return;
		}
		System.out.print(root.data + " ");
		for (TreeNode n : root.child) {
			print(n);
		}
	}
	
	public TreeNode takeInput() {
		System.out.println("Enter root Data");
		int rootData = scanner.nextInt();
		if (rootData == -1)
			return null;
		TreeNode root = new TreeNode(rootData);
		System.out.println("Enter no of children for " + rootData);
		int childCount = scanner.nextInt();
		while (childCount > 0) {
			TreeNode next = takeInput();
			root.child.add(next);
			childCount--;
		}
		return root;
	}
	
	public int TotalLeaf(TreeNode root) {
		if (root.child == null) {
			return 0;
		}
		int count = 1;
		for (TreeNode s : root.child) {
			count = count + TotalLeaf(s);
		}
		return count;
	}
}