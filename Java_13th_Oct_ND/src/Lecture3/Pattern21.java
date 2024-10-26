package Lecture3;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =7;
		int row =1;
		int nst1 = 1;
		int nsp = 2*n-3;
		int nst2 =1;
		
		while(row<=n) {
			int cst1 = 0;
			if(row==n) {
				cst1++;
			}
			while(cst1<nst1) {
				System.out.print("* ");
				cst1++;
			}
			
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst2 = 0;
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
			}
			
			row++;
			nst1++;
			nst2++;
			nsp-=2;
			System.out.println();
		}
	}

}
