package Lecture1;

public class GreatestOfThree_Optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  =100;
		int b = 20;
		int c = 500;
		
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if (b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
	}

}
