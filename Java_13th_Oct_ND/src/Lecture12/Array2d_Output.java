package Lecture12;

import java.util.Arrays;

public class Array2d_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {1,2,3} 
					, {4,5,6}, 
					   {7,8,9}};
		
//		for (int a[] : arr) {
//			for (int i : a) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

}
