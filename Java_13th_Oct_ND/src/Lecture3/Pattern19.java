package Lecture3;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int row =1;
		int nst1 = (n+1)/2;
		int nst2 = (n+1)/2;
		int nsp = -1;
		
		while(row<=n) {
			int cst1 =0;
			while(cst1<nst1) { // star component 1 
				System.out.print("* ");
				cst1++;
			}
			
			int csp = 0;
			while(csp<nsp) { // mid space component
				System.out.print("  ");
				csp++;
			}
			
			int cst2 = 0;
			if(row==1 || row == n) {
				cst2 =1;
			}
			while(cst2<nst2) { // 2nd Star component
				System.out.print("* ");
				cst2++;
			}
			
			if(row< (n+1)/2) {
				nst1--;
				nst2--;
				nsp+=2;
			}
			else {
				nst1++;
				nst2++;
				nsp-=2;
			}
			row++;
			System.out.println();
		}
	}

}
