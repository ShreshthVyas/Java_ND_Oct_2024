package Lecture7;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,2,3,-1,-4,10,12};
		System.out.println(linearSearch(arr ,-10));
	}

	public static boolean linearSearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
	}

}
