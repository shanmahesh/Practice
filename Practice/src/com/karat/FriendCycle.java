package com.karat;
import java.util.*;

public class FriendCycle {

	public static void main(String args[]) {
		
	 String[][] employees = {
		     { "1", "Bill", "Engineer"},
		  {"2", "Joe", "HR"},
		  {"3", "Sally", "Engineer"},
		  {"4", "Richard", "Business"},
		  {"6", "Tom", "Engineer"}
		     };

		String[][] friendships = {
		  {"1", "2"},
		     {"1", "3"},
		   {"3", "4"},
		   {"6", "1"},
		  
		  };
		     
		     Map<String, List<String>> names = new HashMap<String,List<String>>();
		     Map<String, Integer> deptotal = new HashMap<String,Integer>();
		     Map<String, Integer> depfrdtotal = new HashMap<String,Integer>();
		     Map<String, String> dep = new HashMap<String,String>();
		     
		     
		     for(String[] e:employees){
		        names.put(e[0],new ArrayList<String>());
		       deptotal.put(e[2], deptotal.getOrDefault(e[2],0)+1 );
		     dep.put(e[0],e[2]);  
		     }
		     
		     
		     
		     
		     for(String[] e:friendships){
		       List<String> list = names.getOrDefault(e[0], new ArrayList<String>());
		         list.add(e[1]);
		       
		        List<String> list2= names.getOrDefault(e[1], new ArrayList<String>());
		       list2.add(e[0]);
		       
		       names.put(e[0],list);
		       names.put(e[1],list2);
		         
		     }
		    
		     String[] o =  names.keySet().toArray(new String[0]);
		     
		     StringBuffer sb = new StringBuffer();
		     for(int i=0;i<o.length;i++){
		       sb.append(o[i]).append(": ");
		       if( names.get(o[i]).size() > 0){
		         String own_dep = dep.get(o[i]);
		       for(String fr : names.get(o[i])){
		         sb.append(fr).append(" ");
		         
		         String frnd_dep = dep.get(fr);
		         if(!own_dep.equals(frnd_dep) ){
		           depfrdtotal.put(own_dep,depfrdtotal.getOrDefault(own_dep,0)+1);
		         }
		       }
		       }else{
		         sb.append("None");
		       }
		       System.out.println(sb);
		       sb.delete(0,sb.length());
		     }
		    
		      System.out.println(deptotal);
		      System.out.println(depfrdtotal);
		     
}
	
	
}
