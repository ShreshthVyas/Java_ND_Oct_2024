package Lecture17;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =8;
		System.out.println(Fib(8));
	}

	public static int Fib(int n) {
		// TODO Auto-generated method stub
		if(n ==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		int f1 = Fib(n-1);
		int f2 = Fib(n-2);
		
		return f1+f2;
		
	}

}
