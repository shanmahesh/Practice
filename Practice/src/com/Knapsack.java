package com;

/**
 * @author ShanmugasundaramM
 *
 */
public class Knapsack {

	public static int max(int a, int b) {
		return a>b?a:b;
	}
	
	public static int knapsack(int W, int[] wt,int[] val,int n) {
		
		if(n<=0) {
			return 0;
		}
		
		if(wt[n-1]>W) {
			return knapsack(W,wt,val,n-1);
		}
		
		return max(val[n-1]+knapsack(W-wt[n-1],wt,val,n-1), knapsack(W,wt,val,n-1));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int W = 20;
		int[] wt = {50,20,40};
		int [] val = {50,100,20};*/
		
		int W = 8;
		int[] val = {1,2,5,6};
		int [] wt = {2,3,4,5};
		
		//System.out.print(knapsack(W,wt,val,wt.length));
		
		int[][] matrix = new int[wt.length+1][W+1];
		
		for(int i=0;i<=wt.length;i++) {
			for(int j=0;j<=W;j++) {
				if(i==0 || j==0) {
					matrix[i][j] = 0;
				}else if(wt[i-1] > W  ) {
					matrix[i][j] =matrix[i-1][j] ;
				}else {
					if(j-wt[i-1] >=0)
					matrix[i][j] = max(val[i-1]+matrix[i-1][j-wt[i-1]], matrix[i-1][j] );
					else
						matrix[i][j] =matrix[i-1][j] ;
				}
			}
		}
		
	/*	for(int i=0;i<=wt.length;i++) {
			for(int j=0;j<=W;j++) {
			
				if(i==0 || j==0) {
					//System.out.println( i +"--"+j );
					matrix[i][j] = 0;
				}else if(wt[i-1] > W) {
					matrix[i][j] = matrix[i-1][j]; 
				}
				else  {
					if(j-wt[i-1] >=0) 
						matrix[i][j] = max(val[i-1]+ matrix[i-1][j-wt[i-1]], matrix[i-1][j] );
					else
						matrix[i][j] =matrix[i-1][j];
				}
			}
		}
*/
		
		for(int i=0;i<=wt.length;i++) {
			for(int j=0;j<=W;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println("\n");
		}
	}
		
}


