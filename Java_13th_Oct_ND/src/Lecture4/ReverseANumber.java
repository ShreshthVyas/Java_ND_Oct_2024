package Lecture4;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3929;
		int sum =0;
		while(n>0) {
			int r = n%10;
			sum = sum * 10 +r;
			n/=10;
		}
		
		System.out.println(sum);
	}

}
