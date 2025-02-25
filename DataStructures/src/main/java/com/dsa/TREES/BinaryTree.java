package com.dsa.TREES;

public class BinaryTree {

	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else if (data < root.data) {
			root.left = insertRec(root.left, data); // Inserting the left subtree
		} else if (data > root.data) {
			root.right = insertRec(root.right, data); // Inserting the right subtree
		}
		return root;
	}

	public void inOrder() {
		inOrderRec(root);
	}

	private void inOrderRec(Node root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.println(root.data+" ");
			inOrderRec(root.right);
		}
	}

}
