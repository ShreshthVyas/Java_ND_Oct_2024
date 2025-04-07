package Lecture45;

import java.util.Arrays;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,2,5};
		Integer dp[][] = new Integer[arr.length][arr.length];
//		int ans  = rec(arr,0,arr.length-1,1,dp);
//		System.out.println(ans);
		
		BU(arr);
		
	}

	private static int rec(int[] arr, int i, int j, int year,Integer dp[][]) {
		// TODO Auto-generated method stub
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!= null) {
			return dp[i][j];
		}
		int front = arr[i]* year + rec(arr, i+1 , j, year+1,dp);
		int back =  arr[j] * year + rec(arr, i, j-1, year+1,dp);
		return dp[i][j] = Math.max(front, back);
	}
	
	private static void BU(int arr[]) {
		int dp[][] = new int[arr.length][arr.length];
		
		for (int i = 0; i < dp.length; i++) {//fill 0th diagonal
			dp[i][i] = arr[i] * arr.length;
		}
		int year = arr.length-1;
		for (int d = 1; d < dp.length; d++) { // start from 1st diagonal
			for (int j = d; j < dp.length; j++) {
				int i = j-d;
				int front = arr[i]* year + dp[i+1][j];
				int back =  arr[j] * year + dp[i][j-1];
				dp[i][j] = Math.max(front, back);
			}
			year--;
		}
		
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		
		
		System.out.println(dp[0][dp.length-1]);
		
	}

}
