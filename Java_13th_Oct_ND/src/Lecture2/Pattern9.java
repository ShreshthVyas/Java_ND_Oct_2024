package Lecture2;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 7;
		int nst = 1;
		int nsp = n-1;
		
		int row = 1;
		 while(row<=n) {
			 int csp =0;
			 while(csp<nsp) {
				 System.out.print("  ");
				 csp++;
			 }
			 int cst = 0;
			 while(cst<nst) {
				 System.out.print("* ");
				 cst++;
			 }
			 System.out.println();
			 row++;
			 nsp--;
			 nst+=2;
		 }
	}

}
