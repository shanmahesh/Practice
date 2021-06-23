package com.karat;
import java.util.*;

public class AncestorDFS {

	public static void main(String[] argv) {
	     System.out.println("Hello, world!");
	     System.out.println("This is a fully functioning Java environment.");
	  
	     Integer parentChildPairs[][] = { {1, 3}, {2, 3}, {3, 6}, {5, 6},
	                                {5, 7}, {4, 5}, {4, 8}, {8, 10} }; 
	     
	     
	     Map<Integer, List<Integer>> pg = new HashMap<Integer, List<Integer>>();
	     
	     for(Integer[] p:parentChildPairs ){
	       
	       List li = pg.getOrDefault(p[1], new ArrayList<Integer>());
	       li.add(p[0]);
	       
	       pg.put(p[1],li);
	       
	     }
	     
	     boolean visited[] = new boolean[1000];
	     int m= 6;
	     int n =8;
	     
	     doDFS(pg, 3, visited );
	     System.out.println(doDFS(pg, 8, visited ));

	     Arrays.fill(visited, false);
	     doDFS(pg, 5, visited );
	     System.out.println(doDFS(pg, 8, visited ));
	     
	     Arrays.fill(visited, false);
	     doDFS(pg, m, visited );
	     System.out.println(doDFS(pg, n, visited ));

	     Arrays.fill(visited, false);
	     if(pg.get(1) != null && pg.get(1).size() > 0 && pg.get(3) != null && pg.get(3).size() > 0) {
	     doDFS(pg, 1, visited );
	     System.out.println(doDFS(pg, 3, visited ));
	     }else {
	    	 System.out.println(false);
	     }
	     
	     doDFS(pg, 8, visited );
	     
	 }
	   
	   static boolean doDFS( Map<Integer, List<Integer>> pg,int m, boolean visited[] ){
	     
		   //System.out.println(m);
	     if(visited[m]){
	    	 System.out.println(" ** " + m);
	       return true;
	     }
	     
	     visited[m] = true;	
	     
	     if(pg.get(m) != null) {
	    	 
	     for(Integer n: pg.get(m)){
	       
	       if(doDFS(pg,n,visited)){
	         return true;
	       }
	       
	     }
	     }
	     return false;
	     
	   }
	
}
