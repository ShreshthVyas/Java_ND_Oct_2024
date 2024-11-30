package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class jagged_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		
		for (int i = 0; i < arr.length; i++) {
			int s = sc.nextInt();
			int a[] = new int[s];
			arr[i] = a;
			for (int j = 0; j < a.length; j++) {
				a[j] = sc.nextInt();
			}
		}
		
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

}
