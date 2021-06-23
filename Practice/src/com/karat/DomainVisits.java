package com.karat;

import java.util.HashMap;
import java.util.Map;

public class DomainVisits {

	
	public static void main(String a[]) {
	String dm[][] = 	{{"900", "google.mail.com"}, 
			{"50", "yahoo.com"}, {"1", "intel.mail.com"}, {"5", "wiki.org"}};
	
	Map<String, Integer> resultMap = new HashMap<String,Integer>();
	
	for(String s[] : dm) {
		int count = Integer.parseInt(s[0]);
		
		String word[] = s[1].split("\\.");
		String dom = "";
		for(int i=word.length-1;i>=0;i--) {
			
			if(i==word.length-1) {
				//if(resultMap.get(word[i]) != null)
				dom = word[i];
			}else {
				dom =  word[i] + "." + dom;
			}
			resultMap.put(dom, resultMap.getOrDefault(dom, 0) + count);
		}
	}
	
	//["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
	
	System.out.println(resultMap);
	
	}
	
}
