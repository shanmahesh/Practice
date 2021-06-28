package com.tree;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Tree {

	
	
	public static <T> Node<T> getRoot(String s) {
		
		return (Node<T>) buildTree(splitWords(s).iterator(), Integer::parseInt );
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//System.out.println(scan.nextLine());
		
		//Node<Integer> root = buildTree(splitWords(scan.nextLine()).iterator(), Integer::parseInt );
		
		//Node<Integer> root = buildTree(splitWords("5 4 3 x x 8 x x 6 x x").iterator(), Integer::parseInt );

		Node<Integer> root = getRoot("5 4 3 x x 8 x x 6 x x");
		
		System.out.println(" Deapth " + maxDepth(root));
		
		printTree(root);
		
	}
	
	
	private static int maxDepth(Node<Integer> root) {
		
		if(root ==null) {
			return 0;
		}
		
		int l = maxDepth(root.left);
		int r = maxDepth(root.right);
		
		if(l > r) {
			return l + 1;
		}else {
			return r + 1;
		}
		
		
	}
	
	
	
	
	 private static <T> void printTree(Node<T> root) {
		// TODO Auto-generated method stub
		
		 if(root == null)
			 return;

		 System.out.println(root.val);
		 
		 printTree(root.left);
		 if(root.right != null)
			 System.out.println("right");
		 printTree(root.right);
		
	}
	 

	private static <T> Node<T> buildTree(Iterator<String> iter, Function<String,T> f) {
		// TODO Auto-generated method stub
		 String val = iter.next();
		 if(val.equalsIgnoreCase("X"))
			 return null;
		 
		 Node<T> left = buildTree(iter,f);
		 Node<T> right = buildTree(iter,f);
		 
		return new Node<T>(f.apply(val),left,right);
	}


	public static List<String> splitWords(String s) {
	        return s.isEmpty() ? Arrays.asList() : Arrays.asList(s.split(" "));
	  }
	

}


