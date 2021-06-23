package com.way;

public class WeightsDyn {

//	11)	Given an array of weights and a target weight find if the array contains two values that are equal to the target weight.
//	eg: [1 2 5 6 9], Target 10 : true

	
	public static void main(String args[]) {
		
		int a[] = {1,2,3,6,9};
		int w = 10;
		
		int s = a.length;
		
		int x[][] = new int[s+1][s+1];
		
		int i =0;
		int j=0;
		
		while(i<= s) {
			
			if(i == 0) {
				x[i][j] = 0;
				 j++;
				continue;
			}else if(i == j) {
				x[i][j] = 0;
				j++;
				continue;
			}else if(a[i] + a[j] == w) {
				
			}
			
		}		
	}
	
	
}
