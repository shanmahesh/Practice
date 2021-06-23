package com.karat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountAncestors {

	public static void main(String[] argv) {
	     System.out.println("Hello, world!");
	     System.out.println("This is a fully functioning Java environment.");
	  
	     Integer parentChildPairs[][] = { {1, 3}, {2, 3}, {3, 6}, {5, 6},
	                                {5, 7}, {4, 5}, {4, 8}, {8, 10} }; 
	     
	     Map<Integer,Integer> countParentMap = new HashMap<Integer,Integer>();
	     
	     for(int i=0;i<parentChildPairs.length;i++){
	       countParentMap.put(parentChildPairs[i][1],countParentMap.getOrDefault(parentChildPairs[i][1], 0) + 1 );
	       
	       countParentMap.put(parentChildPairs[i][0],countParentMap.getOrDefault(parentChildPairs[i][0], 0));
	       
	     }
	     
	     List<Integer> one = new ArrayList<Integer>();
	     List<Integer> two = new ArrayList<Integer>();
	     List<Integer> three = new ArrayList<Integer>();
	     
	     for(Integer i:countParentMap.keySet()){
	       System.out.println(i);
	       System.out.println(countParentMap.get(i));
	        if(countParentMap.get(i) == 0){
	          one.add(i);
	        }else if(countParentMap.get(i) == 1){
	          two.add(i);
	        }else if(countParentMap.get(i) == 2){
	          three.add(i);
	        }
	     }
	     
	     System.out.println(one);
	         System.out.println(two);
	     System.out.println(three);
	     
	     
	   }
}
