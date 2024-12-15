package Lecture17;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec(1);
	}

	public static void rec(int n) {
		// TODO Auto-generated method stub
		if(n>10) {
			return;
		}
		System.out.println(n);
		rec(n+1);
	}

}
