package Lecture24;

import java.util.Arrays;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,-2,-3,4,2,8,7,3};
		int ans = part(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		System.out.println(ans);
	}

	public static int part(int[] arr, int si, int  ei) {
		// TODO Auto-generated method stub
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
