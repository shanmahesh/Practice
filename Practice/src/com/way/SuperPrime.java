package com.way;

public class SuperPrime {

	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int N= 242;
		boolean n[] = new boolean[N+1];
		
		
		n[0] = false;
		n[1] = false;
		
		for(int i=2;i<=N;i++) {
			n[i] = true;
		}
		
		//1    4   6   8 9 10    12   14 15 16    18   20 21 22
		//  2 3  5   7        11   13          17    19         23
		
		for(int i=2;i*i<=N;i++) {
			
			if(n[i] == true) {
				for(int j=i*2 ;j<=N; j = j+i ) {
					n[j] = false;	
				}	
			}
		}
		
		int j = 0;
		int prime[] = new int[N+1];
		
		for(int i =0; i<=N;i++) {
			if(n[i]) {
				prime[j++] = i;
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		
		for(int i =0; i<j;i++) {
			if(n[i+1])
				System.out.print(prime[i] + " ");
		}
		
		
		
	}
	
}
