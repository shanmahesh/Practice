package com.vin;

import java.util.Arrays;

public class MaxCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int candies[] = {2,3,5,1,3};
		
		System.out.println(maxCandies(candies));
		
		System.out.println(Arrays.toString(dstrbCandies(candies,3,maxCandies(candies))));
	}
	
	static int maxCandies(int candies[]) {
		
		int max = 0;
		
		for(int i=0;i<candies.length;i++) {
			if(candies[i] > max)
				max = candies[i];
		}
		
		return max;
	} 

	
	static boolean[] dstrbCandies(int[] a, int n, int max ) {
		boolean[] dist = new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(a[i] + n >= max) {
				dist[i] = true;
			}
		}
		
		return dist;
	}
	
}
