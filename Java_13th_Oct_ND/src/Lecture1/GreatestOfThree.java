package Lecture1;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =20;
		int c = 5;
		int max  = -1;
		if(a>b) {
			max = a;
		}
		else {
			max = b;
		}
		
		if(c>max) {
			max = c;
		}
		
		System.out.println(max);
	}

}
