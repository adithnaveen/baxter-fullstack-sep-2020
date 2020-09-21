package com.baxter.training03.tree;

public class BinaryImpl {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(); 
		
		System.out.println("is Empty " + tree.isEmpty());
		
		
		tree.add(100); 
		tree.add(250);
		tree.add(150);
		tree.add(55);
		tree.add(20);
		
		System.out.println(tree);
		
		tree.traverseInOrder(tree.root); 
		System.out.println();
		tree.traversePostOrder(tree.root);
		System.out.println();
		tree.traversePreOrder(tree.root);
	}
}
