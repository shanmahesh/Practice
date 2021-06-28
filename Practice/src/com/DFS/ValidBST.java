package com.DFS;

import java.util.StringJoiner;

import com.tree.Node;
import com.tree.Tree;

public class ValidBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> root = Tree.getRoot("5 4 3 x x 8 x x 6 x x"); //true
		
		System.out.println("Valid : " + validBST(root));
		
		
		
		System.out.println("Valid : " + validBST(root));
		
		root = Tree.getRoot("1 2 4 x x 5 x x 3 6 x x 7 x x");
		
		StringJoiner sj = new StringJoiner(""); 
		
		System.out.println("Valid : " + serialize(root, sj));
		
	}

	
	private static String serialize(Node<Integer> root, StringJoiner str) {
		
		if(root == null) {
			str.add("X");
			return "X";
		}
		
		str.add(String.valueOf(root.val));
		
		serialize(root.left,str);
		serialize(root.right,str);
		
		return str.toString();
	}
	
	
	
	private static boolean validBST(Node<Integer> root) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return true;
		
		if(root.left != null && root.left.val > root.val)
			return false;
		
		if(root.right != null && root.right.val < root.val)
			return false;
		
		if(!validBST(root.left) || !validBST(root.right))
			return false;
		
		return true;
	}
	
}
