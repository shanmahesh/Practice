package com.DFS;

public class MaxDeapth {
	  Node root;
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxDeapth tree = new MaxDeapth();
		  
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);
  
        System.out.println("Height of tree is : " +
                                      tree.maxDepth(tree.root)); //4
		
	}

	private int maxDepth(Node node) {
		// TODO Auto-generated method stub
		
		if(node == null) {
			return 0;
		}else {
			int l = maxDepth(node.left);
			int r = maxDepth(node.left);
			
			if(l > r) {
				return l + 1;
			}else {
				return r + 1;
			}
	
	}

}
}

class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

