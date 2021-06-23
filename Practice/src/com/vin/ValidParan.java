package com.vin;

import java.util.HashMap;
import java.util.Stack;

public class ValidParan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(validParen("aa(vv)[xx]"));
		
		System.out.println(validParen("a(s[f{v}b]v)vv[f{e}r]hbbbb"));
		
		System.out.println(validParen("([{])[{}]"));
	}

	static boolean validParen(String s) {
		
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		
		hm.put('(', ')');
		hm.put('[', ']');
		hm.put('{', '}');
		
		Stack<Character> st = new Stack<Character>();
		
		for(Character c : s.toCharArray()) {
			
			if(hm.containsKey(c)) {
				st.push(c);
			}else if(hm.containsValue(c)) {
				Character p = st.pop();
				
				if(c != hm.get(p)) {
					return false;
				}
			}
			
		}
		
		
		if(!st.isEmpty())
			return false;
		
		return true;
	} 
	
}
