package com.codility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CircleIntersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r[] = {1,5,2,1,4,0};
		
		int begin[][] = new int[r.length][2];
		
		for(int i=0;i<r.length;i++) {
			begin[i][0] = i - r[i];
			begin[i][1] =  r[i];
		}
		
		System.out.println(Arrays.deepToString(begin));
		
		Arrays.sort(begin, new Comparator<int[]>() {
			@Override
			public int compare(int a[], int b[]) {
				return a[0] - b[0];
			}
		});
		
		System.out.println(Arrays.deepToString(begin));
		
		PriorityQueue<Integer> end = new PriorityQueue<Integer>( new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		} ) ;
		end.add(begin[0][1]);
		int counter = 0;
		for(int i=1;i<begin.length;i++) {
			
			int endT = end.poll();
			if(endT > begin[i][0]) {
				counter++;
				end.add(endT);
			}else {
				end.add(begin[i][1]);
			}
			
		}
		
		System.out.println(counter);
		
	}

}
