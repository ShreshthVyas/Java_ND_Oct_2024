package Lecture24;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,1,3,2,4,-1};
		int ans [] = mergesort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] mergesort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si==ei) {
			int temp[] = new int[1]; 
			temp[0] = arr[si];
			return temp;
		}
		
		int mid = (si+ei)/2;
		int fh[] = mergesort(arr, si, mid);
		int sh[] = mergesort(arr, mid+1, ei);
		
		return mergetwoSortedArray(fh, sh);
		
		
	}
	public static int[] mergetwoSortedArray(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int i =0;
		int j =0;
		int k =0;
		int ans[] = new int[arr.length+brr.length];
		while(i<arr.length && j<brr.length) {
			if(arr[i]<brr[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			}
			else {
				ans[k] = brr[j];
				j++;
				k++;
			}
		}
		
		// brr is smaller
		while(i<arr.length) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		
		//arr is smaller
		while(j<brr.length) {
			ans[k] = brr[j];
			j++;
			k++;
		}
		
		return ans;
		
		
	}

}
