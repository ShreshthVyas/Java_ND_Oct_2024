package Lecture20;

import java.util.Scanner;

public class KeypadCombination {
	static String arr[] = {"*", "abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		keypad(s,"");
		
	}
	public static void keypad(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()== 0) {
			System.out.println(ans);
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
