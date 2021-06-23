package com.vin;

public class LongestPalindrome {

	
	public static void main(String args[]) {
		
		String a = "xxraccarvv";
		
		String palinDrome = "";
		
		for(int i=0;i<a.length();i++) {
			for(int j= a.length(); j>i; j--) {
				if(isPalindrome(a.substring(i,j))) {
					if(a.substring(i,j).length() > palinDrome.length()) {
						palinDrome = a.substring(i,j);
					}
				}
			}
		}
		
		
		System.out.println(palinDrome);
		
	}
	
	
	static boolean isPalindrome(String s) {
		
		
		if(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())){
			return true;
		}
		
		return false;
		
	}
	
}
