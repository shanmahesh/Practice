package com.karat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdPurchaseClciks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] completed_purchase_user_ids = { "3123122444","234111110", "8321125440", "99911063"};
		
		String[][] ad_clicks = {
		
					{"122.121.0.1","2016-11-03 11:41:19","Buy wool coats for your pets"},
					{"96.3.199.11","2016-10-15 20:18:31","2017 Pet Mittens"},
					{"122.121.0.250","2016-11-01 06:13:13","The Best Hollywood Coats"},
					{"82.1.106.8","2016-11-12 23:05:14","Buy wool coats for your pets"},
					{"92.130.6.144","2017-01-01 03:18:55","Buy wool coats for your pets"},
					{"92.130.6.145","2017-01-01 03:18:55","2017 Pet Mittens"}
		};

		String[][] all_user_ips = {
		
				{"2339985511","122.121.0.155"},
				{"234111110","122.121.0.1"},
				{"3123122444","92.130.6.145"},
				{"39471289472","2001:0db8:ac10:fe01:0000:0000:0000:0000"},
				{"8321125440","82.1.106.8"},
				{"99911063","92.130.6.144"}
		};

		List<String> pids = Arrays.asList(completed_purchase_user_ids);
		
		List<String> allip = new ArrayList<String>();
		List<String> alliuid = new ArrayList<String>();
		
		for(String[] s:all_user_ips) {
			allip.addAll(Arrays.asList(s[1]));
			alliuid.addAll(Arrays.asList(s[0]));
		}
		
		for(String g[] : ad_clicks) {
			
		}
		
		
		Map<String, Integer> clicks = new HashMap<String,Integer>();
		Map<String, Integer> purchase = new HashMap<String,Integer>();
		Map<String, Integer> clickips = new HashMap<String,Integer>();
		
		List<String> allIps = new ArrayList<String>();
		List<String> alluids = new ArrayList<String>();
		
		for(String[] ip : all_user_ips) {
			allIps.addAll(Arrays.asList(ip[1]));
			alluids.addAll(Arrays.asList(ip[0]));
		}
		
		System.out.println(allIps);
		System.out.println(alluids);
		List<String> puids =  Arrays.asList(completed_purchase_user_ids);
		
		
		System.out.println(puids);
		
		for(String s[]:ad_clicks ) {
			clicks.put(s[2], clicks.getOrDefault(s[2], 0)+1);
			String uid = "";
			if(allIps.indexOf(s[0]) > -1) {
				 uid = alluids.get(allIps.indexOf(s[0]) );
			}
			
			if(puids.contains(uid))
				purchase.put(s[2], purchase.getOrDefault(s[2], 0)+1);
		}
		
		System.out.println(purchase);
		
		for(String s:clicks.keySet()) {
			
			System.out.println(purchase.getOrDefault(s,0) + " " + "of" + " " + clicks.get(s) + " " + s);
			
			
		}
		
	
		/*Bought Clicked Ad Text
		1 of 2  2017 Pet Mittens
		0 of 1  The Best Hollywood Coats
		3 of 3  Buy wool coats for your pets
		*/
		
		
	}

}
