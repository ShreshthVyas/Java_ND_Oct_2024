package Lecture2;

public class Pattern2 {
	public static void main(String[] args) {
		int n  =4;
		int row = 1;
		int nst = 4;
		
		while(row<=n) { 
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			System.out.println();
		}
	}
}
