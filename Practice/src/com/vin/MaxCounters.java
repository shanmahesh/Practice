package com.vin;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,4,4,6,1,4,4};
		
		int count = 5;
		
		int res[] = new int[5];
		
		int maxCounter = 0;
		int startLine = 0;
		
		for(int i =0; i< a.length;i++) {
			
			if(a[i] < count+1) {
				
				if(res[a[i]-1] < startLine)
					res[a[i]-1] +=  startLine + 1;
				else
					res[a[i]-1] += 1;
					
				if(maxCounter < res[a[i]-1]) {
					maxCounter = res[a[i]-1];
				}
			}else {
				startLine = maxCounter;
			}
			
			
		}
		
		
		for(int i=0;i<res.length;i++) {
			if(res[i] < startLine)
				res[i] =   startLine;
		}
		
		System.out.println(Arrays.toString(res));
		
	}

}
