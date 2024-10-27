package Lecture4;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 36;
		int divisor = 60;
		
		while(dividend % divisor !=0) {
			int r = dividend % divisor;
			dividend = divisor;
			divisor = r;
		}
		
		System.out.println(divisor);
	}

}
