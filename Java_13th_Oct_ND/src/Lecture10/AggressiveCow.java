package Lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int arr[] = new int[nos];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(binarysearch(arr, nos, noc));
	}
	
	public static int binarysearch(int arr[],int nos, int noc) {
		int i =1;
		int j = arr[arr.length-1]- arr[0]; 
		int ans =1;
		while(i<=j) {
			int mid = (i+j)/2;
			if(isItPossible(arr,noc,mid)) {
				ans = mid;
				i = mid+1;
			}
			else {
				j = mid-1;
			}
		}
		
		return ans;
		
	}

	public static boolean isItPossible(int[] arr, int noc, int mid) {
		// TODO Auto-generated method stub
		int place =0;
		int cpsf =1;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] - arr[place] >= mid) {
				cpsf++;
				place = i;
			}
			if(cpsf== noc) {
				return true;
			}
		}
		return false;
	}

}
