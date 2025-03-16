package Lecture39;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class GroupAnagram {
	public static void main(String[] args) {

	}

	public List<List<String>> groupAnagrams(String[] arr) {
		HashMap<String,List<String>> map = new HashMap<>();
		
		for (String s: arr) {
			char ch[] = s.toCharArray();
			Arrays.sort(ch);
			String str = new String(ch);
			
			if(map.containsKey(str)) {
				map.get(str).add(s);
			}
			else {
				List<String> list =  new ArrayList<>();
				list.add(s);
				map.put(str, list);
			}
		}
		List<List<String>> ans = new ArrayList<>(map.values());
//		for (String s : map.keySet()) {
//			ans.add(map.get(s));
//		}
		
		return ans;
	}
}
