package com.vin;

public class ChangeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String w1 = "horse";
		String w2 = "ros";
	/*	   ros
		  0123
		h 1123
		o 2212
		r 3222
		s 4332
		e 5443
	*/	
		
		String s[]=new String[2];
		s[0]=w1;s[1]=w2;
		
		int dp[][]=new int[s[0].length()+1][s[1].length()+1];
		
		for(int i=0;i<=s[0].length();i++)	dp[i][0]=i;
		for(int j=0;j<=s[1].length();j++)	dp[0][j]=j;
		
		
		for(int i=0;i<=s[0].length();i++) {
			for(int j=0;j<=s[1].length();j++) {
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i=1;i<dp.length;i++){
			for(int j=1;j<dp[i].length;j++){
				if(s[0].charAt(i-1)==s[1].charAt(j-1))		
					dp[i][j]=dp[i-1][j-1];
				else		
					dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
			}
		}
		
		for(int i=0;i<=s[0].length();i++) {
			for(int j=0;j<=s[1].length();j++) {
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(dp[s[0].length()][s[1].length()]);
	}
		
		


}
