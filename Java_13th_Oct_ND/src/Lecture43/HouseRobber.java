package Lecture43;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,2,7,13,4,11};
		int dp[] = new int[arr.length+1];
		Arrays.fill(dp, -1);
		dpTD(arr,arr.length-1,dp);
		
	}

	private static int dpTD(int[] arr, int i,int dp[]) {
		// TODO Auto-generated method stub
		if(i<0) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int rob = arr[i] + dpTD(arr,i-2,dp);
		int didnotrob = dpTD(arr,i-1,dp);
		
		return dp[i] = Math.max(rob, didnotrob);
		
	}
	private static int dpBU(int arr[]) {
		if(arr.length ==1) {
			return arr[0];
		}
		int dp[] = new int[arr.length];
		dp[0]= arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i-2];
			int didnotrob = dp[i-1];
			dp[i] = Math.max(rob, didnotrob);
		}
		
		return dp[dp.length-1];
		
	}
//	private static int rec(int[] arr, int i) {
//		// TODO Auto-generated method stub
//		if(i<0) {
//			return 0;
//		}
//		
//		int rob = arr[i] + rec(arr,i-2);
//		int didnotrob = rec(arr,i-1);
//		
//		return Math.max(rob, didnotrob);
//		
//	}

}
