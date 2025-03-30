package Lecture43;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =45;
		int arr[] = new int[n+1];
//		System.out.println(fibDP(n,arr));
		
		System.out.println(fibdpBU(n));
	}

//	private static int fib(int n) {
//		// TODO Auto-generated method stub
//		if(n ==1 || n==0) {
//			return n;
//		}
//		int f1 = fib(n-1);
//		int f2 = fib(n-2);
//		return f1+f2;
//	}
	private static int fibDP(int n,int arr[]) { //memoisation
		//Top Down
		// TODO Auto-generated method stub
		if(n ==1 || n==0) {
			return n;
		}
		if(arr[n]!=0) { // IF already calculated return
			return arr[n];
		}
		int f1 = fibDP(n-1,arr);
		int f2 = fibDP(n-2,arr);
		
		return arr[n] = f1+f2;
	}
	
	private static int fibdpBU(int n) {// Bottom Up
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			int f1 = dp[i-1];
			int f2 = dp[i-2];
			dp[i] = f1+f2;
		}
		
		return dp[n];
	}
	
	

}
