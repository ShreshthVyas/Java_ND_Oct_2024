package Lecture12;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {1,2,3},{4,5,6},{7,8,9}};
		transpose(arr);
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void transpose(int arr[][]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

}
