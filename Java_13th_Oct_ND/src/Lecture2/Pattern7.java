package Lecture2;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n-2;
		int nst = n;
		int row = 1;
		
		while(row<=n) {
			if(row==1 || row==n) {
				int cst = 0;
				 while(cst < nst) {
					 System.out.print("* ");
					 cst++;
				 }
			}
			else {
				System.out.print("* ");
				int csp = 0;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				System.out.print("* ");
			}
			System.out.println();
			row++;
		}
		
		
	}

}
