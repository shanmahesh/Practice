package com.DFS;

public class MaxDepth {

	public Node<Integer> root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxDepth tree = new MaxDepth();
		
		tree.root = tree.new Node<Integer>(1);
		tree.root.left = tree.new Node<Integer>(2); 
		tree.root.right = tree.new Node<Integer>(3);
		tree.root.left.left = tree.new Node<Integer>(4);
		tree.root.left.right = tree.new Node<Integer>(5);
		tree.root.left.left.left = tree.new Node<Integer>(6);
		
		System.out.println(" Max Depth: " + maxDepth(tree.root));
		
	}
	
	
	

	private static int maxDepth(Node<Integer> root) {
		// TODO Auto-generated method stub
		
		if(root == null) {
			return 0;
		}else {
			
			int l = maxDepth(root.left);
			int r = maxDepth(root.right);
			
			if(l > r) {
				return l + 1;
			}else {
				return r + 1;
			}
			
		}
		
	}


	class Node<T>{
		public T val;
		public Node right, left;
		
		public Node(T val1){
			val = val1;
		}
		
	} 
	
}

