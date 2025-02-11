package Lecture25;

import java.util.Arrays;
import java.util.Random;

public class RandomizedQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = { 9,-2,-3,4,2,8,7,3};
		
		quickSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return;
		}
		
		int pivot = part(arr, si, ei);
		quickSort(arr, si, pivot-1);
		quickSort(arr, pivot+1, ei);
		
	}

	public static int part(int[] arr, int si, int  ei) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int a = rn.nextInt(ei-si+1)+si;
		int t = arr[ei];
		arr[ei] = arr[a];
		arr[a] = t;
		int item = arr[ei];
		int idx = si;
		
		for (int i = si; i <ei; i++) {
			if(arr[i]<item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		
		return idx;
	}

}
