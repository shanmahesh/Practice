package com;

public class BubbleSort {
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		int arr[] = {12,24,8,65,45,-6};
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j] >= arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}*/
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					int ttemp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = ttemp;
				}
				
			}
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
