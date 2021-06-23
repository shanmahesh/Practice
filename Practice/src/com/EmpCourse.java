package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpCourse {

	 public static void main(String[] argv) {
	     System.out.println("Hello, world!");
	     System.out.println("This is a fully functioning Java environment.");


	     String [][] stu ={
	       {"1","A"},
	       {"2","B"},
	       {"3","C"},
	       {"1","D"},
	       {"5","E"},
	       {"2","A"},
	       {"1","B"}
	     };

	     Map<String, List<String>> stuMap = new HashMap<String, List<String>>();

	     
	     
	     for(String[] x: stu){
	       if(!stuMap.containsKey(x[0])){
	         stuMap.put(x[0], new ArrayList<String>());
	         stuMap.get(x[0]).add(x[1]);
	       }else{
	         stuMap.get(x[0]).add(x[1]);
	       }
	       System.out.println(x[0] + x[1]);
	     }

	     
	     
	     String[] s = (String[]) stuMap.keySet().toArray();
	     ArrayList<String> resul = new ArrayList<String>() ; 

	     for(int i=0;i<s.length;i++){
	       for(int j=0;j<s.length;j++){
	         int index = 0;
	         if(s[i]==s[j]) continue;
	        
	         
	       }

	     }

	   }
	
}
