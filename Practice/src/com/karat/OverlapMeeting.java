package com.karat;

import java.util.Arrays;
import java.util.Comparator;

public class OverlapMeeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[][] intr = {{1300,1500},{930,1200},{830,845}}; 

		 Arrays.sort(intr, (a,b)-> Integer.compare(a[0],b[0]) );
		
		 //int s = 1450;
		 //int e = 1500;
		 
		 int s = 820;
		 int e = 830;
		 
		 for(int i=0;i<intr.length;i++) {
			 
			 if( (s >= intr[i][0] &&  s < intr[i][1] ) || 
					 (e > intr[i][0] &&  e <= intr[i][1] )
					 ){
						 System.out.println("Overlap");
						 
					 }
			 
		 }
		
		 //{[1300,1500],[930,1200],[830,845]},new meeting [820,830], return true, [1450,1500] return false
	}

}
