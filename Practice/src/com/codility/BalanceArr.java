package com.codility;

public class BalanceArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,1,2,4,3};
		
		int j = a.length-1;
		int leftSum = 0;
		int rightSum = 0;
		
		leftSum = a[0];
		int diff = 0;
		
		for(int i=1;i<a.length;i++) {
			rightSum += a[i];
		}
		
		diff = Math.abs(leftSum - rightSum);
		
		for(int i=1;i<a.length;i++) {
			leftSum += a[i];
			rightSum -= a[i];
			
			if(leftSum < rightSum) {
				diff = Math.min(diff, Math.abs(leftSum - rightSum));
			}
		}
	
		System.out.println(diff);
		
	}

}
