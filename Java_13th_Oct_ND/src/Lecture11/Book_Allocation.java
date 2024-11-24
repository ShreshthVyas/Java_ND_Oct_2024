package Lecture11;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int nob = sc.nextInt();
			int nos =sc.nextInt();
			int arr[] = new int[nob];
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] =  sc.nextInt();
				sum+= arr[i];
			}
			System.out.println(binarysearch(arr,nos,nob,sum));
		}
		
	}

	public static int binarysearch(int[] arr, int nos, int nob, int sum) {
		// TODO Auto-generated method stub
		int i =1;
		int j = sum;
		int ans =0;
		while(i<=j) {
			int mid = (i+j)/2;
			if(isItpossible(arr,nos,nob,mid)) {
				ans= mid;
				j = mid-1;
			}
			else {
				i = mid+1;
			}
		}
		
		return ans;
	}

	public static boolean isItpossible(int[] arr, int nos, int nob, int mid) {
		// TODO Auto-generated method stub
		int s = 1;
		int pages_read = 0;
		for (int i = 0; i < arr.length; ) {
			if(pages_read+ arr[i]<=mid) {
				pages_read+= arr[i];
				i++;
			}
			else{
				s++;
				pages_read = 0;
			}
			if(s>nos) {
				return false;
			}
		}
		return true;
	} 

}
