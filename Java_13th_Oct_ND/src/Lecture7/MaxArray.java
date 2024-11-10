package Lecture7;

import java.util.Iterator;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  { 1,3,-4,5,10,18,2};
		
		int max  = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]> max) {
//				max =  arr[i];
//			}
			max  = Math.max(max, arr[i]);
		}
		
		System.out.println(max);
	}

}
