package com.way;

public class Knap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int W = 8;
		int[] val = {1,2,5,6};
		int [] wt = {2,3,4,5};
		
		int r[][] = new int[val.length + 1][W+1];
		
		
		
		
		
		for(int i=0;i<val.length+1;i++) {
			for(int j=0;j<W+1;j++) {
				
				if(i==0 || j==0) {
					r[i][j] = 0;
				}else if(wt[i-1] > W) {
					r[i][j] = r[i-1][j];
					
				}else { 
					if(j - wt[i-1] > 0 ) {
						
						System.out.println(" J " + j + " -- " + wt[i-1] + " " + r[i-1][j] );
						
						r[i][j] = Math.max(val[i-1]+r[i-1][j-wt[i-1]], r[i-1][j]);
					}else {
						r[i][j] = r[i-1][j];
					}
					
				}
				
			}
			
		}
		
		

		for(int i=0;i<val.length+1;i++) {
			for(int j=0;j<W+1;j++) {
				System.out.print(r[i][j] + " ");
			}
			System.out.println(" ");
		}
			
		
		
	}

}
