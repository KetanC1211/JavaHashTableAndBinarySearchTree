package com.bridgelabz;

public class BSTMain {

	public static void main(String[] args) {	
			BinarySearchTree tree = new BinarySearchTree();
			//Adding Root
			tree.insert(56);
			//Nodes just below root
			tree.insert(30);
			tree.insert(70);
			//Adding Child nodes for 30 and 70
			tree.insert(22);
			tree.insert(40);
			tree.insert(60);
			tree.insert(95);
			//Adding Child nodes for 22 and 60
			tree.insert(11);
			tree.insert(65);
			//Adding leaf nodes
			tree.insert(3);
			tree.insert(16);
			tree.insert(63);
			tree.insert(67);

			// print inorder traversal of the BST
			tree.search(tree.root, 63);
	}
}
