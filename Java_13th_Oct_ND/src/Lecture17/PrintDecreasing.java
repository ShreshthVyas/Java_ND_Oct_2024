package Lecture17;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec(1);
	}

	public static void rec(int n) {
		// TODO Auto-generated method stub
		if(n>10) {
			return;
		}
		rec(n+1);
		System.out.println(n);
	}

}
