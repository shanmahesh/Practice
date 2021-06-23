package com.vin;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("ABCD","ABD"));
		
	}

	static boolean isAnagram(String s1, String s2) {
		
		int alpha[] = new int[26];
		
		for(Character c : s1.toCharArray()) {
			alpha[Character.toLowerCase(c) - 'a']++;
		}
		
		for(Character c : s2.toCharArray()) {
			alpha[Character.toLowerCase(c) - 'a']--;
		}
		
		for(int i=0;i<alpha.length;i++) {
			if(alpha[i] < 0 || alpha[i] > 0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
}
