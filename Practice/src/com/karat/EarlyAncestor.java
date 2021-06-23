package com.karat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class EarlyAncestor {
	public static void main(String[] argv) {
	     System.out.println("Hello, world!");
	     System.out.println("This is a fully functioning Java environment.");
	  
	     Integer parentChildPairs[][] = { {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {8, 10}, {11, 2}  }; 
	     
	     
	     Map<Integer, List<Integer>> pg = new HashMap<Integer, List<Integer>>();
	     
	     for(Integer[] i: parentChildPairs) {
	    	 List<Integer> plist = pg.getOrDefault(i[1], new ArrayList<Integer>());
	    	 plist.add(i[0]);
	    	 
	    	 pg.put(i[1], plist);
	    	 
	     }
	     int n = 6;
	     
	     Stack<Integer> anStack = new Stack<Integer>();
	     doDFS(pg,n,anStack);
	     
	     System.out.println(anStack.pop());

	     
	}
	
	static void doDFS( Map<Integer, List<Integer>> pg, int n,  Stack<Integer> anStack) {
		
		 System.out.println(n);
		anStack.push(n);
		
		if(pg.get(n)!= null) {
			for(Integer x: pg.get(n))
			doDFS(pg,x,anStack);
		}
		
	}
	
}
