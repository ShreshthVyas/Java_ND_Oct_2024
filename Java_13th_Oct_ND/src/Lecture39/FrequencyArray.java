package Lecture39;

import java.util.HashMap;

public class FrequencyArray {
	public static void main(String[] args) {
		String s = "AAAAbbbBBBcccccc*DDDDaaaaabghfhdw";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for (Character ch : s.toCharArray()) {
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}
//			else {
//				map.put(ch, 1);
//			}
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(map);
		
	}
}
