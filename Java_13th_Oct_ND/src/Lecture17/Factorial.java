package Lecture17;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(prod(n));
		
	}
	public static int prod(int n) {
		if(n == 1) {
			return 1;
		}
		int prod_n_minus_one = prod(n-1);
		return prod_n_minus_one * n;
	}
	}


