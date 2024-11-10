package Lecture7;

public class swap3 {
	public static void main(String[] args) {
		int arr[] =  {1,2,3,4,5};
		int brr[] = {6,7,8,9,10};
		
		System.out.println(arr[0]+ " " + brr[0]);
		swap(arr,brr);
		System.out.println(arr[0]+ " " + brr[0]);
	}

	public static void swap(int[] crr, int[] drr) {
		// TODO Auto-generated method stub
		int temp[] = crr;
		crr =drr;
		drr = temp;
		
	}
	
}
