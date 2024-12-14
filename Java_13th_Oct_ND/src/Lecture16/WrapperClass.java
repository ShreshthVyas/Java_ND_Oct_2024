package Lecture16;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer b = a; //AutoBoxing
		Integer c = Integer.valueOf(a);
		
		int d = b; //Unboxing
		Integer e = null;
		
		
		
		System.out.println(a == b);
		
		Integer arr[] = new Integer[5];
		
		for (Integer i : arr) {
			System.out.println(i);
		}
	}

}
