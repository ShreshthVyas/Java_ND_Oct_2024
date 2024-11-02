package Lecture5;

import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int mul =1;
		
		while(n>0) {
			int r = n%10;
			ans = ans+ r*mul;
			mul = mul*2;
			n = n/10;
		}
		
		System.out.println(ans);
	}

}
