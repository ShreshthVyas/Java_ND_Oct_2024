package Lecture39;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String , Integer> map =  new LinkedHashMap<>();
		//O(1)
		map.put("A", 1);
		map.put("B", 10);
		map.put("C", 2);
		map.put("D",3);
		map.put("E", 4);
		map.put("F", 5);
		map.put("A",44);
//		map.put(null, 54);
		map.put(null, 540);
		map.put(null, null);
		map.put("null", 80);
		System.out.println(map);
		
		// 0(1)
		System.out.println(map.get("A"));
		System.out.println(map.get(null));
		System.out.println(map.get("null"));
		
		//O(1)
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("AA"));
//		HashMap<String , Integer> map =  new HashMap<>();
//		//O(1)
//		map.put("A", 1);
//		map.put("B", 10);
//		map.put("C", 2);
//		map.put("D",3);
//		map.put("E", 4);
//		map.put("F", 5);
//		map.put("A",44);
////		map.put(null, 54);
//		map.put(null, 540);
//		map.put(null, null);
//		map.put("null", 80);
//		System.out.println(map);
//		
//		// 0(1)
//		System.out.println(map.get("A"));
//		System.out.println(map.get(null));
//		System.out.println(map.get("null"));
//		
//		//O(1)
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsKey("AA"));
		
		
		
	

//		TreeMap<String , Integer> map =  new TreeMap<>(Collections.reverseOrder());
//		//O(1)
//		map.put("A", 1);
//		map.put("B", 10);
//		map.put("F", 5);
//		map.put("C", 2);
//		
//		map.put("E", 4);
//		map.put("D", 3);
//		map.put("A",44);
////		map.put(null, 54);
////		map.put(null, 540);
////		map.put(null, null);
//		map.put("null", 80);
//		System.out.println(map);
//		
//		// 0(1)
//		System.out.println(map.get("A"));
//		System.out.println(map.get("null"));
//		
//		//O(1)
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsKey("AA"));
		
		
//		for (String s : map.keySet()) {
//			System.out.println(map.get(s));
//		}
		
		System.out.println(map.getOrDefault("AA", 10));
	}

}
