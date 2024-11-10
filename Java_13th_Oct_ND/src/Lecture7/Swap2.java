package Lecture7;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5};
		System.out.println(arr[0] + "  " + arr[2]);
		swap(arr,0,2);
		System.out.println(arr[0] + "  " + arr[2]);
	}
	public static void swap(int[] arr, int i, int j) {
		int temp =  arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
