package Lecture44;

import java.util.Arrays;

public class MinFallingPathSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{}};
		int dp[][] = new int[arr.length+1][arr[0].length+1];
		for (int[] is : dp) {
			Arrays.fill(is,-20001);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans,rec(arr,0,i,dp));
		}
//		return ans;
	}

	private static int rec(int[][] arr, int cr, int cc, int[][] dp) {
		// TODO Auto-generated method stub
		if(cc<0 || cc>=arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr == arr.length-1) {
			return arr[cr][cc];
		}
		if(dp[cr][cc]!= -20001) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < dp.length; i++) {
			if(i!=cc) {
				ans = Math.min(ans,rec(arr, cr+1, i, dp));
			}
		}
		
		return dp[cr][cc] = arr[cr][cc] + ans;
	}

}
