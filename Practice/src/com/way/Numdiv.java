package com.way;

public class Numdiv {

	
	public static void main(String args[]) {
	
		long n = 19000000000l;	
		
		int i= 0;
		
	while (n> 0) {
		
		long x =  (n%62l);
		
		System.out.println(x);
		
		n = n/62;
		
		System.out.println(n);
		i++;
	}
		
	System.out.println(i);
	
	
	}
	
}
