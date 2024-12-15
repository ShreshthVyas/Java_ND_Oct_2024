package Lecture17;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(3,4));
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 1) {
			return a;
		}
		
		return pow(a,b-1) * a;
	}

}
