package Lecture43;

import java.util.Arrays;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";String t = "ace";
//		int dp[][] = new int[s.length()+1][t.length()+1];
//		for (int[] is : dp) {
//			Arrays.fill(is, -1);
//		}
//		lcsTD(s,t,0,0,dp);
		lcsbu(s, t);
	}

//	private static int lcsrec(String s, String t,int i,int j) {
//		// TODO Auto-generated method stub
//		if(i>= s.length() || j>= t.length()) {
//			return 0;
//		}
//		if(s.charAt(i)==t.charAt(j)) {
//			return 1 + lcsrec(s, t, i+1, j+1);
//		}
//		else {
//			int skipS = lcsrec(s, t, i+1, j);
//			int skipT = lcsrec(s, t, i, j+1);
//			return Math.max(skipS, skipT);
//		}
//	}
	private static int lcsTD(String s, String t,int i,int j,int dp[][] ) {
		// TODO Auto-generated method stub
		if(i>= s.length() || j>= t.length()) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		if(s.charAt(i)==t.charAt(j)) {
			return dp[i][j] = 1 + lcsTD(s, t, i+1, j+1,dp);
		}
		else {
			int skipS = lcsTD(s, t, i+1, j,dp);
			int skipT = lcsTD(s, t, i, j+1,dp);
			return dp[i][j] = Math.max(skipS, skipT);
		}
	}
	
	private static int lcsbu(String s, String t) {
		int dp[][] = new int[s.length()+1][t.length()+1];
		System.out.println("jj");
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {// match
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else { // mismatch
					int skipS = dp[i-1][j];
					int skipT = dp[i][j-1];
					dp[i][j] = Math.max(skipS, skipT);
				}
			}
		}
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		
		return dp[s.length()][t.length()];
		
	}

}
