package com;

import java.util.HashMap;
import java.util.Map;

public class Tries {

	private Node root;
	
	public Tries() {
		root = new Node();
	}
	
	public void insert(String word) {
		insertRecur(root,word,0);
	}
	
	public void insertRecur(Node currentNode,String word,int n){
		//base case
		if(n==word.length()) {
			currentNode.setEow(true);
			return;
		}
		
		char assignChar = word.charAt(n);
		Node nextNode = currentNode.getMap().get(assignChar);
		
		if(nextNode == null) {
			nextNode = new Node();
			currentNode.getMap().put(assignChar, nextNode);
		}
		
		insertRecur(nextNode,word,n+1);
		
	}
	
	
	public Node searchRecur(Node current, String word, int n, String searchString) {
		//base case
		if(n==word.length()) {
			
			return current;
		}
		
		char assignChar = word.charAt(n);
		
		Node nextNode = current.getMap().get(assignChar);
		
		//System.out.println(assignChar + " " + nextNode.getMap().toString() + " "+ nextNode.isEow());
		
		if(nextNode != null) {
			if(nextNode.isEow()) {
				searchString+=assignChar;
				return nextNode;
			}else{
				searchString+=assignChar;
				System.out.println(searchString);
				return searchRecur(nextNode,  word,  n+1,searchString);
			}
		}else {
			//searchString = "";
			n=word.length();
		}
		return current;
		
	}
	
	
	private void search(String word) {
		String searchString = "";
		 searchRecur(root, word, 0, searchString);
		System.out.println("Found word::" + searchString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries tri = new Tries();
		
		tri.insert("abcde");
		tri.search("xyz");
		
			
		Node next = tri.root.getMap().get('a');
		
		
		System.out.println( tri.root.getMap().toString() + " " + next.getMap().toString());

	}

}


class Node{
	
	private Map<Character,Node> map;
	private boolean eow;

	public Node() {
		super();
		this.map = new HashMap<Character, Node>();
		this.eow = false;
	}
	public Map<Character, Node> getMap() {
		return map;
	}
	public void setMap(Map<Character, Node> map) {
		this.map = map;
	}
	public boolean isEow() {
		return eow;
	}
	public void setEow(boolean eow) {
		this.eow = eow;
	}
}