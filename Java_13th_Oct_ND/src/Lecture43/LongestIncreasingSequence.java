package Lecture43;
import java.util.Arrays;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLIS(int[] arr) {
		int dp[] = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < dp.length; i++) {
			for (int j = i-1; j>=0; j--) {
				if(arr[i]>arr[j]) {
					int prev = dp[j]+1;
					dp[i] = Math.max(dp[i], prev);
				}
			}
		}
		int max = 0;
		for (int i : dp) {
			max = Math.max(max, i);
		}
		return max;
 	}

}
