package Lecture7;

public class ArraySwapInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  { 1,3,-4,5,10,18,2};
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		Reverse(arr , 1,4);
		System.out.println();
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public static void Reverse(int[] arr , int i ,int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}
	}
