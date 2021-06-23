package com.codility;

import java.util.Arrays;

public class ArrMaxCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//3,2,2,4,2
		int a[] = {3,4,4,6,1,4,4};
		int counter[] = new int[5];
		int max_counter = 0;
		int start_line = 0;
		for(int i=0;i<a.length;i++) {
		
			int x = a[i] - 1;
			
			if(a[i] > counter.length) {
				//max counter
				start_line = max_counter;
			}else {
				if(counter[x] < start_line) {
					counter[x] = counter[x] + start_line;
				}
					counter[x]++;
					
					if(counter[x] > max_counter) {
						max_counter = counter[x];
					}
			}	
		}
		
		for(int i=0;i<counter.length;i++) {
			if(counter[i] < start_line) {
				counter[i] = start_line;
			}
				
		}
		
		System.out.println(Arrays.toString(counter));
		
		
	}

}
