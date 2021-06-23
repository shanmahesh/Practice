package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SortIntByString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] ix = new Integer[]{2 , 15 ,10, 25,72,45};
		
		
		/*Arrays.sort(ix, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				
				String s1 = String.valueOf(o1);
				String s2 = String.valueOf(o2);
				
				return s1.compareTo(s2);
				
			}
			
		});*/
		
		
		for (int js : ix) {
			//System.out.print( js + " " );	
		}
		
		
		
		int[] color = new int[] {2,0,2,1,1,0};
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int x:color) {
			hm.put(x, hm.getOrDefault(x, 0) + 1);
		}
		
		System.out.print(hm);
		
		int k = 0;
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<hm.get(i);j++) {
				
				color[k] = i;
				k++;
			}
			
		}
		
		System.out.print( Arrays.toString(color));
		
	}
	

}
