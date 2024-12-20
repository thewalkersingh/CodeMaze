package Trees;
public class TreeUse {
	public static void main(String[] args) {
		Tree tree = new Tree();
		TreeNode n1 = new TreeNode(5);
		TreeNode b1 = new TreeNode(4);
		TreeNode b2 = new TreeNode(7);
		TreeNode b3 = new TreeNode(12);
		TreeNode c1 = new TreeNode(51);
		TreeNode c2 = new TreeNode(56);
		
		n1.child.add(b1);
		n1.child.add(b2);
		n1.child.add(b3);
		b1.child.add(c1);
		b2.child.add(c2);
		System.out.println("Total count: " + tree.TotalLeaf(n1));
		tree.print(n1);
		
		TreeNode treeNode = tree.takeInput();
		tree.print(treeNode);
	}
}