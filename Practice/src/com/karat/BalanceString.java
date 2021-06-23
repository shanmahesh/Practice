package com.karat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalanceString {
	public static void main(String[] argv) {
	     System.out.println("Hello, world!");
	     System.out.println("This is a fully functioning Java environment.");
	  
	     String s1[] = {"123 45 67 8901234 5678", "12345 8 9 0 1 23"};
	     List<String> s2 = new ArrayList<String>();
	     
	     for(String v: s1){
	        String s[] = v.split("\\s");
	       s2.addAll(Arrays.asList(s));
	     }
	     
	     String s[] = s2.toArray(new String[0]);
	       
	     List<String> result = new ArrayList<String>();
	     
	     int n= 23;
	     int i=0;
	     StringBuffer sb = new StringBuffer();
	     
	     while(i<s.length){
	       if(sb.length() <n && (sb.length() + 1+ s[i].length()) <= n){
	          if(sb.length() > 0){
		           sb.append("-").append(s[i]);
		         }else{
		           sb.append(s[i]);
		         }
	         
	       }else{
	           StringBuffer sb1 = new StringBuffer();
	         if(sb.length()<n){
	           int fillNeeded = n-sb.length();
	           
	           String words[] = sb.toString().split("-");
	           
	           
	           
	           int e = fillNeeded/words.length;
	           int x = fillNeeded%words.length;
	           
	           for(int j=0;j<words.length;j++){
	             System.out.println(words[j] + e + x);
	             if(j!=words.length-1)
	            sb1.append(words[j]).append("-");//.append("-".repeat(e));  
	             else{
	               sb1.append(words[j]);//.append("-".repeat(e)); 
	             }
	           }
	           
	           if(x>0){
	             System.out.println(sb1);
	            // sb1.append("-".repeat(x));
	             
	           }
	         }
	         
	         result.add(sb1.toString());
	         sb.delete(0,sb.length());
	         
	         sb.append(s[i]);
	       }
	       i++;
	     }
	     
	     if(sb.length()>0){
	       StringBuffer sb1 = new StringBuffer();
	         if(sb.length()<n){
	           int fillNeeded = n-sb.length();
	           
	           String words[] = sb.toString().split("\\s");
	           
	           int e = fillNeeded/words.length;
	           int x = fillNeeded%words.length;
	 
	           
	           for(int j=0;j<words.length;j++){
	            sb1.append(words[j]);//.append("-".repeat(e));  
	           }
	           if(x>0)
	             sb1.append("-");//.repeat(x));
	         }
	         
	       
	      result.add(sb.toString());
	     }
	     
	     System.out.println(result);
	  
	   }
}
