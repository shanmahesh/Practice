package com;

public class Tree {

	public Node root;
	
	public Tree() {
		root = new Node();
	}
	
	public Node insert(Node parent, Object o){
		
		Node child = new Node();
		
		child.parent = parent;
		child.item = o;
		child.firstChild = null;
		
		
		
		if(parent.firstChild !=null) {
			Node current = parent.firstChild;
			
			while(current.nextSibling !=null) {
				current = current.nextSibling;
			}
			
			current.nextSibling = child;
		}else {
			parent.firstChild = child;
		}
			
		 return child;
	}
	
	
	public void inOrderTraversal() {
		
	}
	
	public static void main(String args[]) {
		
		Tree tree = new Tree();
		tree.root.item = 1;
		Node node2 = tree.insert(tree.root, 2);
		tree.insert(node2, 3);
		tree.insert(node2, 4);
		tree.insert(node2, 5);
		
		Node node6 = tree.insert(tree.root, 6);
		tree.insert(node6, 7);
		tree.insert(node6, 8);
		tree.insert(node6, 9);
		
		tree.root.preOrderVisit();
		System.out.print("\n");
		tree.root.postOrderVisit();
		
	}
	
	class Node{
		public Node parent;
		public Object item;
		public Node firstChild;
		public Node nextSibling;
		
		public void print() {
			System.out.print(item.toString());
		}
		
		public void preOrderVisit() {
			this.print();
			
			if(this.firstChild !=null) 
				this.firstChild.preOrderVisit();
			
			if(this.nextSibling != null)
				this.nextSibling.preOrderVisit(); 
			
		}
		
		
		public void postOrderVisit() {
			
			
			if(this.firstChild !=null) {
				this.firstChild.postOrderVisit();
			}
			this.print();
			
			if(this.nextSibling != null) {
				this.nextSibling.postOrderVisit();
			
			}
			
		}
		
		
		public void inOrderVisit() {
			
			
			if(this.firstChild !=null) {
				this.firstChild.postOrderVisit();
			}
			this.print();
			
			if(this.nextSibling != null) {
				this.nextSibling.postOrderVisit();
			
			}
			
		}
		
		
		
		
	}
}

