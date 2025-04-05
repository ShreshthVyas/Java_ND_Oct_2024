package Lecture44;

import java.util.Arrays;

public class CoinChanges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {1,2,5};
		int amnt = 11;
//		int dp[][] = new int[coin.length+1][amnt+1];
//		for (int[] is : dp) {
//			Arrays.fill(is,-1);
//		}
//		rec(coin,amnt,0,dp);
		
		coinchangeBU(amnt, coin);
		
		
	}

	private static int rec(int[] coin, int amnt, int idx,int dp[][]) {
		// TODO Auto-generated method stub
		if(amnt == 0) {
			return 1;
		}
		if(idx == coin.length) {
			return 0;
		}
		if(dp[idx][amnt]!=-1) {
			return dp[idx][amnt];
		}
		int inc =0;int exc =0;
		if(amnt>= coin[idx]) {
			inc+= rec(coin, amnt-coin[idx], idx,dp);
		}
		exc+= rec(coin, amnt, idx+1,dp);
		
		return dp[idx][amnt] = inc+ exc;
	}
//	private static int rec(int[] coin, int amnt, int idx) {
//		// TODO Auto-generated method stub
//		if(amnt == 0) {
//			return 1;
//		}
//		if(idx == coin.length) {
//			return 0;
//		}
//		
//		int inc =0;int exc =0;
//		if(amnt>= coin[idx]) {
//			inc+= rec(coin, amnt-coin[idx], idx);
//		}
//		exc+= rec(coin, amnt, idx+1);
//		
//		return inc+ exc;
//	}
	
	public static void coinchangeBU(int amnt, int[] coin) {
		int dp[][] = new int[amnt+1][coin.length+1];
		
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		
		for (int amt = 1; amt < dp.length; amt++) { // amnt
			for (int i = 1; i < dp[0].length; i++) { // idx
				int inc =0;int exc =0;
				if(amt>= coin[i-1]) {
					inc+= dp[amt-coin[i-1]][i];
				}
				exc+= dp[amt][i-1];
				dp[amt][i] = inc +exc;	
			}
		}
		
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		
		
		
	}
	

}
