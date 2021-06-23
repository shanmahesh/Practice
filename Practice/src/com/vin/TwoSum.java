package com.vin;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String args[]) {
		
		int a[] = {2,7,11,15,6,3};
		int target = 9;
		
		find(a,target);
		
		Arrays.parallelSort(a);
		
		int j = a.length-1;
		int i = 0;
		
		while(i<a.length && j>=0) {
			
			if(a[i] + a[j] == target) {
				System.out.println(i + " -- " + j);
				break;
			}else if(a[i] + a[j] > target ) {
				j--;
			}else {
				i++;
			}
			
		}
		
	}
	
	
	static void find(int[] a, int target) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			int diff = target - a[i];
			
			if(hm.containsKey(diff)) {
				System.out.println(i + " -- " + hm.get(diff));
				//break;
			}
			
			hm.put(a[i], i);
			
		}
		
		
	}
	
	
}
