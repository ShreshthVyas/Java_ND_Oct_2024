package Lecture2;

public class Pattern1 {
	 public static void main(String[] args) {
		int n  =4;
		int row = 1;
		int nst = 1;
		
		while(row<=n) { 
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			nst++;
			row++;
			System.out.println();
		}
	}
}
