package tree;

public class BinaryTree {
	public Node root;
	public BinaryTree(Node r) {
		root = r;
	}
	public void addNode(int d) {
		addNode(root, d);
	}
	private void addNode(Node current, int d) {
		if (d > current.data) {
			if (current.rightChild == null)
				current.rightChild = new Node(d);
			else 
				addNode(current.rightChild, d);
		}
		else if (d < current.data) {
			if (current.leftChild == null) 
				current.leftChild = new Node(d);
			else
				addNode(current.leftChild, d);
		}
	}
	public Node findNodeInOrder(int d) {
		return findNodeInOrder(root, d);
	}
	private Node findNodeInOrder(Node current, int d) {
		if (current.leftChild != null) {
			return findNodeInOrder(current.leftChild, d);
		}
		else if (current.data == d) {
			return current;
		}
		else if (current.rightChild != null) { 
			return findNodeInOrder(current.rightChild, d);
		}
		else {
			System.out.println("No node found");
			return null;
		}
	}
	public Node findNodePreOrder(int d) {
		return null;
	}
	public Node findNodePostOrder(int d) {
		return null;
	}
	public void print() { 
		printInOrder(root);
	}
	private void printInOrder(Node current) {
		if (current.leftChild != null) 
			printInOrder(current.leftChild);
		System.out.println(current.data);
		if (current.rightChild != null)
			printInOrder(current.rightChild);
	}
}
