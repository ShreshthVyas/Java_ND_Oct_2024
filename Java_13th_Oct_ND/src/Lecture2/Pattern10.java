package Lecture2;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int nst = 2*n -1;
		int row = 1;
		int nsp =0;
		
		while(row<=n) {
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
			
			row++;
			nst-=2;
			nsp++;
			System.out.println();
		}
	}

}
