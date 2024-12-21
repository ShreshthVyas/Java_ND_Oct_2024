package Lecture17;

public class SumOfNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
//		
//		System.out.println(sumN(n));
		System.out.println(sum2(1));
		
	}
	public static int sumN(int n) {
		if(n == 1) {
			return 1;
		}
		int sum_n_minus_one = sumN(n-1);
		return sum_n_minus_one + n;
	}
	
	public static int sum2(int n) {
		if(n>5) {
			return 0;
		}
		
		return sum2(n+1) + n ;
	}

}
