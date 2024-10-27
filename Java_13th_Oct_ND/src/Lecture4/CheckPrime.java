package Lecture4;

import java.util.Iterator;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n  = sc.nextInt();
		boolean flag = false;
		for(int i = 2; i<n;i++) {
			System.out.println(i);
			if(n%i == 0) { 
				flag =true;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
		
		
	}

}
