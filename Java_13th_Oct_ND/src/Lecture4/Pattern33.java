package Lecture4;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		int val =n;
		while(row<=n) {
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst = 0;
			while(cst<nst) {
				if(cst == nst/2) {
					System.out.print("0 ");
				}
				else {
					System.out.print(val + " ");
				}
				
				if(cst<nst/2) {
					val++;
				}
				else {
					val--;
				}
				cst++;
				
			}
			nsp--;
			nst+=2;
			row++;
			System.out.println();
		}
		
	}

}
