package Lecture3;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row = 1;
		int nst =n;
		int nsp = n-1;
		
		while(row<= 2*n -1) {
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			if(row<n) {
				nst--;
				nsp--;
			}
			else {
				nst++;
				nsp++;
			}
			
			row++;
			System.out.println();
		}
		
	}

}
