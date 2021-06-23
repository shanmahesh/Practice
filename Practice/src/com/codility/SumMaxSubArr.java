package com.codility;

public class SumMaxSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,-4,8,-10,-2,4,-3,2,7,-8,3,-5,3};
		
		int localMax = 0;
		int globalMax = 0;
		
		localMax = a[0];
		globalMax = a[0];
		/*for(int i=1;i<a.length;i++) {
			
			if( a[i] > localMax + a[i])
				localMax = a[i];
			else
				localMax = localMax + a[i];
			
			if(localMax > globalMax) {
				globalMax = localMax;
			}
			
		}*/
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i] > a[i] + localMax) {
				localMax = a[i];
			}else {
				localMax += a[i];
			}
			
			if(localMax > globalMax) {
				globalMax = localMax;
			}
			
			
		}
		
		
		
		
		
		System.out.println(globalMax);
		
	}

}
