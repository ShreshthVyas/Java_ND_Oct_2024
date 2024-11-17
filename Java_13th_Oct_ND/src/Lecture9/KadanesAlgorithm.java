package Lecture9;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(int[] nums) {

		int max = Integer.MIN_VALUE;
		int sum  =0;
		for (int i = 0; i < nums.length; i++) {
			sum+= nums[i];
			max= Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		
		return max;
	}

}
