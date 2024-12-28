package Lecture20;

import java.util.ArrayList;
import java.util.List;

public class KepadCombinationLeetcode {
	static String arr[] = { "*", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public static List<String> letterCombinations(String digits) {
		keypad(digits, "");
		return list;
	}
	public static void keypad(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()== 0) {
			if(ans!=""){
                list.add(ans);
            }
			return;
		}
		
		char ch =  s.charAt(0);
		int idx = ch - '0';
		String temp= arr[idx];
		
		for (int i = 0; i < temp.length(); i++) {
			keypad(s.substring(1), ans+ temp.charAt(i));
		}
		
	}

}
