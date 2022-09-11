package code_test;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(6);
		root.right.left = new Node(5);
		List<Integer> list = new ArrayList<Integer>();
		Solve solve = new Solve();
		solve.solve(root, 1, list, "root");
		for (Integer i : list) {
			System.out.print(i + ", ");
		}
	}
}

class Solve {
	int maxLevel = 0;

	void solve(Node root, int level, List<Integer> list, String string) {
		System.out.println("root - " + root);
		if (root == null) {
			return;
		}
		if (maxLevel < level) {
			list.add(root.data);
			maxLevel = level;
		}
		solve(root.left, level + 1, list, "left");
		solve(root.right, level + 1, list, "right");
	}
}

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}