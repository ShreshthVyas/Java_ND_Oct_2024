package Lecture23;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,9};
		int brr[] = {2,3,8,10};
		
		int ans[] = merge(arr,brr);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] merge(int[] arr, int[] brr) {
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
