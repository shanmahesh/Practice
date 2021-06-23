package com.karat;

import java.util.ArrayList;
import java.util.List;

public class LongSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s[][] = {
			{"3234.html", "xys.html", "7hsaa.html"}, // user1
			{"3234.html", "sdhsfjdsh.html", "xys.html", "7hsaa.html"} // user2
		};
		
		int r[][] = new int[s[0].length+1][s[1].length+1];
		
		int max = 0;
		int maxij[] = new int[2];
		
		for(int i=0;i<=s[0].length;i++) {
			for(int j=0;j<=s[1].length;j++) {
				if(i==0 || j== 0) {
					r[i][j] = 0;
				}else if(s[0][i-1].equalsIgnoreCase(s[1][j-1])) {
					r[i][j] = r[i-1][j-1] + 1;
					if(r[i][j] > max) {
						max = r[i][j];
						maxij[0] = i;
						maxij[1] = j;
					}
				}else {
					r[i][j] = 0;
				}
				
			}
		}
		
		int i =maxij[0];
		int j =maxij[1];
		List<String> s1 = new ArrayList<String>();
		while(r[i][j]> 0) {
			s1.add(s[0][i-1]);
			i--; j--;
		}
		
		System.out.println(s1);
		
	}

}
