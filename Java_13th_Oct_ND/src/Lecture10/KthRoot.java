package Lecture10;

import java.util.Scanner;

public class KthRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long i = 1;
		long j = n;
		long ans = -1;
		while(i<=j) {
			long mid = (i+j) /2;
			if(Math.pow(mid, k)<=n) {
				ans =mid;
				i = mid +1;
			}
			else {
				j = mid-1;
			}
		}
		
		System.out.println(ans);
	}
	
	

}
