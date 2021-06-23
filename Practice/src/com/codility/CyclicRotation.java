package com.codility;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3,5,7.2.8
		int a[] = {7,2,8,3,5};
		
		int n = 2;
		
		System.out.println(Arrays.toString(rotate(a,2)));
		
	}

	static int[] rotate(int[] a, int n) {
		
		int[] result = new int[a.length];
		
		for(int i =0; i<a.length;i++) {
			
			int pos = (i+n)%a.length;
			
			result[pos] = a[i];
			
		}
		
		
		return result;
	}
	
}
