package Lecture6;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 6;
		int row =0;
		
		int nst =1;
		while(row<n) {
			int cst = 0;
			int val  =1;
			while(cst<nst) {
				System.out.print(val + " ");
				val = val * (row-cst)/(cst+1);
				cst++;
			}
			row++;
			nst++;
			System.out.println();
		}
		
	}

}
