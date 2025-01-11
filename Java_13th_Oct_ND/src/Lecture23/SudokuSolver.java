package Lecture23;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		rec(arr,0,0);
	}

	public static void rec(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		if(col == 9) {
			row++;
			col =0;
		}
		if(row == 9) {
			Display(arr);
			return;
		}
		if(arr[row][col]!=0) {
			rec(arr, row, col+1);
		}
		else {
			for (int val = 1; val < 10; val++) {
				if(isItpossible(val,arr,row,col)) {
					arr[row][col] = val;
					rec(arr, row, col+1);
					arr[row][col] = 0;
				}
			}
		}
		
		
	}

	public static boolean isItpossible(int val, int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		//row
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][col] == val) {
				return false;
			}
		}
		
		//col
		for (int i = 0; i < arr.length; i++) {
			if(arr[row][i] == val) {
				return false;
			}
		}
		
		//3*3
		int r = row -row%3;
		int c = col - col%3;
		
		for (int i = r; i < r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(arr[i][j] == val) {
					return false;
				}
			}
		}
		
		
		return true;
	}

	private static void Display(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
