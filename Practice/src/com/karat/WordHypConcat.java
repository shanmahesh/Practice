package com.karat;
import java.util.*;

public class WordHypConcat {
	public static void main(String[] argv) {
	     System.out.println("Hello, world!");
	     System.out.println("This is a fully functioning Java environment.");
	  
	     String s[] = {"1p3acres", "is", "a", "good", "place", "for", "communicate"};
	     List<String> result = new ArrayList<String>();
	     
	     int n= 12;
	     int i=0;
	     StringBuffer sb = new StringBuffer();
	     
	     while(i<s.length){
	       if(sb.length() <12 && (sb.length() + 1 + s[i].length()) <= 12){
	         if(sb.length() > 0){
	           sb.append("-").append(s[i]);
	         }else{
	           sb.append(s[i]);
	         }
	       }else{
	         result.add(sb.toString());
	         sb.delete(0,sb.length());
	         sb.append(s[i]);
	       }
	       i++;
	     }
	     
	     if(sb.length()>0)
	      result.add(sb.toString());
	     
	     System.out.println(result);
	  
	   }
}
