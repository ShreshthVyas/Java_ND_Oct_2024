package Lecture6;

import java.util.Scanner;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int c = countOfDigits(n);
		int p = DigitPowerSum(n, c);
		
		if(n == p) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
	
	public static int countOfDigits(int n) {
		int count  =0;
		while(n>0) {
			n =n /10;
			count++;
		}
		return count;
	}
	
	public static int DigitPowerSum(int n , int count) {
		int sum  =0;
		
		while(n>0) {
			int dig = n %10;
			sum = sum + (int) Math.pow(dig, count);
			n  = n/10;
		}
		
		return sum;
	}

}
