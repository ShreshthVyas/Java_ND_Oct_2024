package Lecture46;

public class LuckyNumber {
//	An Lucky-number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5.
//	First few Lucky-numbers are 5, 25,  (5 + 25), 125, 130(125 + 5), ….
//	Write a function to find the nth Lucky-number.
//
//	Input: n = 3
//	Output: 30
//
//	Input: n = 6
//	Output: 150 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;

		System.out.println(luckynumber(n));
	}

	private static int luckynumber(int n) {
		// TODO Auto-generated method stub
		int mul =5;
		int ans =0;
		while(n>0) {
			if((n&1) == 1) {
				ans+=mul;
			}
			mul = mul*5;
			n>>=1;
		}
		return ans;
	}

}
