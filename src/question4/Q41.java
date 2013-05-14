package question4;

import tree.BinaryTree;
import tree.Node;

public class Q41 {
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree(new Node(1));
		t.addNode(5);
		t.addNode(3);
		t.addNode(6);
		t.print();
		System.out.println(isBalanced(t));
	}

	public static boolean isBalanced(BinaryTree t) {
		return (maxDepth(t.root) - minDepth(t.root) <= 1);
	}

	public static int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.leftChild), maxDepth(root.rightChild));
	}

	public static int minDepth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.min(minDepth(root.leftChild), minDepth(root.rightChild));
	}
}