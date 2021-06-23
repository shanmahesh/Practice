package com.way;

public class BoxUnload {

	public static void main(String args[]) {
		
		//NbW
		//String s = "b40+3b20-2b10"; //80
		//String s ="10b20+20b10+b10-5b10";  //360
		
		String s ="3b30+15b4+b10-5b10";  //110
		//90+60+10-50 = 110
		
		char sign = '+';
		int i = 0;
		
		int sum = 0;
		int box = 0;
		int x = 1;
		int y = 0;
		boolean boxv = false;
		
		while(i<s.length()){

			if(s.charAt(i) == 'b' ) {
				boxv = true;
			}else if(!boxv) {
				StringBuffer xv = new StringBuffer();
				while(i<s.length() && s.charAt(i) != 'b') {
					xv.append(s.charAt(i));
					i++;
				}
				i--;
				x = Integer.parseInt(xv.toString());
				
				//System.out.println(x);
			}else if(boxv) {
				StringBuffer yv = new StringBuffer();
				while(i<s.length() && (s.charAt(i) != '+' && s.charAt(i) != '-') ) {
					yv.append(s.charAt(i));
					i++;
				}
				
				y = Integer.parseInt(yv.toString());
				//System.out.println(y);
				box = x * y;
				
				if(sign == '+') {
					sum = sum + box;
				}else {
					sum = sum - box;
				}
				
				//System.out.println(sum);
				
				if(i < s.length()) {
					sign = s.charAt(i);
				}
				x=1;
				boxv = false;
			}
			i++;
		}

		System.out.println(sum);
		
	}
		
		
		
}
	

