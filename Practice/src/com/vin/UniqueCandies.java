package com.vin;

import java.util.HashSet;

public class UniqueCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,1,2,2,3,3};
		
		
		
		System.out.println(uniqCandies(a));
		
		System.out.println(maxTypes(a));
		
		System.out.println(maxTypes(new int[]{1,1,2,3}));
		
		System.out.println(maxTypes(new int[]{6,6,6,6}));
		
	}

	static HashSet<Integer> uniqCandies(int[] a){
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i : a) {
			hs.add(i);
		}
		
		return hs;
		
	}
	
	static int maxTypes(int[] a) {
		
		return Math.min(a.length/2, uniqCandies(a).size());
	}
	
}
