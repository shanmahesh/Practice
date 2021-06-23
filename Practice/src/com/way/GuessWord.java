package com.way;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GuessWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//{"MOXTE",3} , {"AXCDG",0},{"MOQRT",2},{"FOUSE",4},{"POWER",2}
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("MOXTE"); //MOE
		words.add("AXCDG"); 
		words.add("MOQRT"); //MO
		words.add("FOUSE"); //OUSE
		words.add("POWER"); //OE
		
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		count.add(3);
		count.add(0);
		count.add(2);
		count.add(4);
		count.add(2);
		
		Set<Character> allowed = new HashSet<Character>();
		Set<Character> notAllowed = new HashSet<Character>();
		HashMap<Character, Integer> countMap = new HashMap<Character,Integer>();
		
		for(int i=0;i<words.size();i++) {
			String s = words.get(i);
			if(count.get(i) == 0 ) {
				for(int j=0;j<s.length();j++) {
					notAllowed.add(s.charAt(i));
				}
				words.remove(i);
				count.remove(i);
				i--;
				continue;
			}
			
				for(int j=0;j<s.length();j++) {
					if( notAllowed.contains(s.charAt(i)) ) {
						s = s.substring(0,j) + s.substring(j+1);
						j--;
						continue;
					}
					
					countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0)+1 );
				}
			
		}
		
		
		
		for(int i=0;i<words.size();i++) {
			String s = words.get(i);
			
			if(s.length() == count.get(i)) {
				for(int j=0;j<s.length();j++) {
					allowed.add(s.charAt(j));
				}
					
				words.remove(i);
				count.remove(i);
				i--;
				continue;
			}
			
			for(int j=0;j<s.length();j++) {
				
				
			}
		
		}
		
		
		
		
		
	}

}
