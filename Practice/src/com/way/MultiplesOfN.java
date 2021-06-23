package com.way;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<Integer>();
		
		int s = compute(2,10,arr);
		
		System.out.println(" Sum: " + s);
		
		arr.forEach(a->System.out.println(a));
		
	}
	
	
	public static int compute(int x, int N, List<Integer> arr) {
		
		int sum = 0;
		
		//4[1,2,3,4,5]
		// 4,8,12,16,20
		
		//5,6,7,9,11,13,14,15
		
		for(int i=x; i<=N  ;i++ ) {
		
				arr.add(i);
			}
		
		
		return sum;
	}
	
	
	
}
