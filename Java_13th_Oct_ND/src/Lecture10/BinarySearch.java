package Lecture10;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,3,4,5,13,17,18};
		System.out.println(binarySearch(arr, 133));
		
	}
	
	public static int binarySearch(int arr[], int k) {
		int i = 0;
		int j = arr.length -1;
		
		while(i<=j) {
			int mid = (i+j)/2;
			if(arr[mid] == k) {
				return mid;
			}
			else if(arr[mid]> k) {
				j = mid-1;
			}
			else {
				i = mid+1;
			}
		}
		
		return -1;
		
	}

}
