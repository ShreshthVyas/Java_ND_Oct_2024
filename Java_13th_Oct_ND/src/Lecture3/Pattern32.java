package Lecture3;

public class Pattern32 {
	public static void main(String[] args) {
		int n  =5;
		int row = 1;
		int nst = 1;
		int val =1;
		while(row<= 2*n-1) {
			int cst = 0;
			while(cst <nst) {
				if(cst%2 == 0) {
					System.out.print(val + " ");
				}
				else {
					System.out.print("* ");
				}
				
				cst++;
			}
			if(row<n) {
				nst+=2;
				val++;
			}
			else {
				nst-=2;
				val--;
			}
			row++;
			
			System.out.println();
		}
	}
}
