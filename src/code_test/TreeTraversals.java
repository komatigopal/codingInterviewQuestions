package code_test;

public class TreeTraversals {
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.right = new BinaryTree(3);
		root.left.left = new BinaryTree(4);
		root.left.right = new BinaryTree(5);
		System.out.println("printing Initial Binary Tree - " + root);
		System.out.println("Calling preOrder");
		preOrder(root);
		System.out.println("Calling inOrder");
		inOrder(root);
		System.out.println("Calling postOrder");
		postOrder(root);
	}

	static void preOrder(BinaryTree root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	static void inOrder(BinaryTree root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	static void postOrder(BinaryTree root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
}

class BinaryTree {
	int data;
	BinaryTree left, right;

	public BinaryTree(int data) {
		this.data = data;
		left = right = null;
	}

	@Override
	public String toString() {
		return "BinaryTree [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}