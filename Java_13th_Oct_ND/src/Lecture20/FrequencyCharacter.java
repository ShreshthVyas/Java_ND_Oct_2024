package Lecture20;

import java.util.Arrays;

public class FrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbccddssdsssssssss";
		int arr[] = new int[26];
		for (char ch : s.toCharArray()) {
			arr[ch-'a']++;
		}
		
		int max = -1;
		char ans = '*';
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				ans  =(char) ('a'+ i); 
			}
		}
		System.out.println(ans);
		
	}

}
