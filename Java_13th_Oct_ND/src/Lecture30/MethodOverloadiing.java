package Lecture30;

public class MethodOverloadiing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,12);
		add(10,12,13);
		add(10,12.2);
		add("a",10,20,30,40,80,90);
		add("a",10,20,30,40,80,90,100,90,500);
		
	}

	private static int add(String string, int i, int...args) {
		// TODO Auto-generated method stub
		int[] arr = args;
		int sum = i;
		for (int j = 0; j < arr.length; j++) {
			sum+= arr[j];
		}
		return sum;
	}

	private static double add(int i, double d) {
		// TODO Auto-generated method stub
		return i+d;
	}

	private static int add(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j+k;
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
