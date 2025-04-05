package Lecture44;

import java.util.Arrays;

public class UncrossedLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxUncrossedLines(int[] s, int[] t) {
		int dp[][] = new int[s.length + 1][t.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s[i-1] == t[i-1]) {// match
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else { // mismatch
					int skipS = dp[i - 1][j];
					int skipT = dp[i][j - 1];
					dp[i][j] = Math.max(skipS, skipT);
				}
			}
		}
//		for (int[] is : dp) {
//			System.out.println(Arrays.toString(is));
//		}

		return dp[s.length][t.length];
	}

	
}
