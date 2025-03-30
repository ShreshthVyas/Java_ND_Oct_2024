package Lecture43;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,15,20};
		int stepZero = rec(arr,0);
		int stepOne = rec(arr,1);
		System.out.println(Math.min(stepZero, stepOne));
	}

	private static int rec(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i>=arr.length) {
			return 0;
		}
		
		int stepone = rec(arr, i+1);
		int steptwo = rec(arr,i+2);
		
		return arr[i] + Math.min(stepone, steptwo);
		
	}

}
