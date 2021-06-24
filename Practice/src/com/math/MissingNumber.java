package com.math;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,5};
		
		System.out.println(find(a,5)); //4
		
		System.out.println(find(new int[] {5},5)); //-1
		
		System.out.println(find(new int[] {2,3,4,5,7},7)); //6
		
		System.out.println(find(new int[] {4},5)); //-5
		
	}

	static int find(int[] arr, int n) {
		
		int i= arr[0];
		int j = 0;
		
		while(i <= n ) {
			
			if(j > arr.length-1)
				return i;
			
			if(i != arr[j]) {
				return i;
			}
			
			i++;j++;
		}
		
		return -1;
	}
	
}
