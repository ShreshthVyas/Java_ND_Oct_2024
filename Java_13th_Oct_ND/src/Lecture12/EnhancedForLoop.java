package Lecture12;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		char arr1[] = {'a','b','c','d'};
		for (int i : arr) {
			System.out.print(i+ " ");
		}
		
		for (char c : arr1) {
			System.out.println(c);
		}
	}

}
