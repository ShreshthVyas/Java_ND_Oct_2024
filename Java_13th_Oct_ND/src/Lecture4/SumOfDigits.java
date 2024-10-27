package Lecture4;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =34567;
		int sum =0;
		while(n>0) {
			int r = n%10;
			sum+=r;
			n =  n/10;
		}
		System.out.println(sum);
	}

}
