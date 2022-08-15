package com.coding.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		map.put("B1", Arrays.asList("A2","A3"));
		map.put("B2", Arrays.asList("A1","A2"));
		map.put("B3", Arrays.asList("A3","A4"));
		map.put("B4", Arrays.asList("A4","A1"));
		
		Map<String,List<String>> newMap = new HashMap();
		
		  Set<String> values = new HashSet<>(); map.entrySet().forEach(x ->
		  values.addAll(x.getValue()));
		  
		  //simple way
			/*
			 * for (String x : values) { List<String> keys = new ArrayList<>();
			 * map.entrySet().forEach(a -> { if (a.getValue().contains(x)) {
			 * keys.add(a.getKey()); newMap.put(x, keys); } });
			 * 
			 * }
			 */
		 
		
			map.entrySet().stream().forEach(a -> {

				a.getValue().forEach(b -> {
					if (newMap.get(b) != null) {
						 if(!newMap.get(b).contains(a.getKey()))
							 newMap.get(b).add(a.getKey());
					} else {
						List<String> keyList = new ArrayList<String>();
						keyList.add(a.getKey());
						newMap.put(b, keyList);
					}
				});
			});
		 
		System.out.println(newMap);
	}
	

}
