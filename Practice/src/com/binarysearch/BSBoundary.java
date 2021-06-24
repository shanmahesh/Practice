package com.binarysearch;

public class BSBoundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arr[] = {false,false,true,true,true};
		System.out.println(find(arr)); //2
		

	}

	static int find(boolean[] arr) {
		
		int l=0;
		int r=arr.length - 1;
		int boundary_index = -1;
		
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]) {
				boundary_index = mid;
				r=mid-1;
			}else {
				l= mid + 1;
			}
		}
		
		return boundary_index;
	}
	
	
}
