package Trees;
import java.util.ArrayList;

public class TreeNode {
	int data;
	ArrayList<TreeNode> child;
	
	TreeNode(int data) {
		this.data = data;
		child = new ArrayList<>();
	}
}