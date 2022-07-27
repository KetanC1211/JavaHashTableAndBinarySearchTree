package com.bridgelabz;

//Java program to demonstrate
//insert operation in binary
//search tree
public class BinarySearchTree {
	
	Node root;
	// Class containing left and right child of current node and key value
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	// Constructor
	BinarySearchTree() { 
		root = null; 
	}

	BinarySearchTree(int value) { 
		root = new Node(value); 
	}

	// Method to insert new value or create new node with that value
	public void insert(int key) { root = insertRec(root, key); }
	// A recursive function to insert a new key in BST
	public Node insertRec(Node root, int key){
		/* If the tree is empty,return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insertRec(root.left, key);
		}
		else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	public void inorder() { 
		inorderRec(root); 
	}

	// A utility function to do inorder traversal of BST
	public void inorderRec(Node root){
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
}
