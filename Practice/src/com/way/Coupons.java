package com.way;

import java.util.HashMap;

public class Coupons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String coupons[][] = {
				{"Home","C1"},
				{"Furniture","C2"},
				{"Bedding","C3"}
				
		};
		
		String categ[][] = {
				{"A",null},
				{"B",null},
				{"Bedding Accesories","Bedding"},
				{"blanket","Bedding Accesories"}
		} ;
		
		
		HashMap<String,String> categMap = loadCateg(categ);
		HashMap<String,String> coupMap = loadCateg(coupons);
		
		System.out.println(getCoupon(categMap, coupMap, "Bedding Accesories"));
		
		System.out.println(getCoupon(categMap, coupMap, "Home"));
		
		
	}
	
	static HashMap<String,String> loadCateg(String categ[][]){
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		for(int i=0;i<categ.length;i++) {
			hm.put(categ[i][0], categ[i][1]);
		}
		
		return hm;
		
	}
	
	static String getCoupon(HashMap<String,String> categMap, HashMap<String,String> coupMap, String input ) {
		
		
		while (input != null) {
			input =  categMap.get(input);
		}
		
		return coupMap.get(input);
		
	}
	
	
}
