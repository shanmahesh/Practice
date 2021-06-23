package com.karat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ax {

	public static void main(String a[]) {
	
	
	   int[][] parentChildPairs1 = new int[][] {
	        {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5},
	        {4, 8}, {4, 9}, {9, 11}, {14, 4}, {13, 12}, {12, 9},
	        {15, 13}
	    };

	    int[][] parentChildPairs2 = new int[][] {
	        {1, 3}, {11, 10}, {11, 12}, {2, 3}, {10, 2},
	        {10, 5}, {3, 4}, {5, 6}, {5, 7}, {7, 8}
	    };

	    
	     Map<Integer, List<Integer>> parentCountMap = new HashMap<Integer,List<Integer>>();
	    
	    for(int[] pair:parentChildPairs1){
	    
	      List<Integer> m = parentCountMap.getOrDefault(pair[1],new ArrayList<Integer>());
	      
	     /* m.add(pair[0]);
	      
	      parentCountMap.put(pair[1], m);
	      
	      List<Integer> n = parentCountMap.getOrDefault(pair[0],new ArrayList<Integer>>)();
	      
	      parentCountMap.put(pair[0], n);*/
	      
	    }
}
	
}
