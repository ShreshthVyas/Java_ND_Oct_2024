package Lecture12;

public class Search_in_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
		int k = 70;
		System.out.println(search(arr, k));
	}
	public static boolean search(int arr[][], int k) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == k) {
					return true;
				}
			}
		}
		
		return false;
	}

}
