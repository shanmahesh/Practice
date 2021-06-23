package com.way;

public class EncDec {

	//CAAAYYXXXXXAIIIVV
		//C1A3Y2X5A1I3V2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encode("CAAAYYXXXXXAIIIVV"));
		System.out.println(decode("C1A3Y2X5A1I3V2"));
	}
	
	static String encode(String s) {
		StringBuffer sb = new StringBuffer();
		int counter = 0;
		
		char prev = s.charAt(0);
		counter++;
		
		for(int i=1; i< s.length();i++) {
			char curr = s.charAt(i); 
			if(prev == curr) {
				counter++;
			}else {
				sb.append(prev).append(counter);
				counter=1;
			}
			
			prev = curr;
			
		}
		
		sb.append(prev).append(counter);
		
		
		return sb.toString();
	}
	
	
	static String decode(String s) {
		StringBuffer sb = new StringBuffer();
		
		for(int i=1;i<s.length();i=i+2) {
			char c = s.charAt(i-1);
			int counter = Integer.parseInt(String.valueOf(s.charAt(i)));
			
			for(int j=0;j<counter;j++) {
				sb.append(c);
			}
			
		}
		
			
			
		return sb.toString();
	}

}
