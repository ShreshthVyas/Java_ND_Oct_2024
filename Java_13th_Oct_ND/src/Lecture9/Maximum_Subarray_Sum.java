package Lecture9;

import java.util.Iterator;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
	
	public static int maxSubArray(int[] nums) {
        
		int max=  Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			max = Math.max(max, sum);
			for (int j = i+1; j < nums.length; j++) {
				sum+= nums[j];
				max = Math.max(max, sum);
			}
		}
		
		return max;
    }

}
