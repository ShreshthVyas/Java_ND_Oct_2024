package Lecture4;

public class PrintAllPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 90;
		int i = 2;
		while(i<=n) {
			if(n%i==0) {
				System.out.print(i + " ");
				n = n/i;
			}
			else {
				i++;
			}
		}
	}

}
