package com.vin;

import java.util.HashSet;

public class SubStrWOrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longSubstr("bbbbbbb"));
		System.out.println(longSubstr("abcabc"));
		
	}
	
	static String longSubstr(String s) {
		
		StringBuffer sb = new StringBuffer();
		
		HashSet<Character> hs = new HashSet<Character>(); 
		
		for(int i=0;i<s.length();i++) {
			
			if(!hs.contains(s.charAt(i))) {
				sb.append(s.charAt(i));
				hs.add(s.charAt(i));
			}else {
				return sb.toString();
			}
			
		}
		
		
		return sb.toString();
	}

}
