package Lecture14;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(isPal(s));
	}

	public static boolean isPal(String s) {
		// TODO Auto-generated method stub
		int i =0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
