package Lecture8;

import java.util.Arrays;
import java.util.Iterator;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(arr, k);
	}
	
//	public static void rotate(int[] nums, int k) {
//        k = k % nums.length;
//		for (int j = 1; j <=k; j++) {
//			int temp = nums[nums.length-1];
//			
//			for (int i = nums.length-2; i>=0 ; i--) {
//				nums[i+1] = nums[i];
//			}
//			
//			nums[0] = temp;
//		} 
//		System.out.println(Arrays.toString(nums));
//		
//	}
	

	public static void rotate(int[] nums, int k) {
         k = k % nums.length;
         
         Reverse(nums, 0, nums.length-1);
         Reverse(nums, 0, k-1);
         Reverse(nums, k, nums.length-1);
         
         System.out.println(Arrays.toString(nums));
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
