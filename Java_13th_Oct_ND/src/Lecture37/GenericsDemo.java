package Lecture37;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,5,6};
		Display(arr);
		
		String arr1[] = { "A" , "B" , "C" , "D"};
		Display(arr1);
		
		Double arr2[] = {1.1,2.2,3.3,4.4,5.5};
		Display(arr2);
	}

	private static <T>void Display(T[] arr) {
		// TODO Auto-generated method stub
		for (T i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}

}
