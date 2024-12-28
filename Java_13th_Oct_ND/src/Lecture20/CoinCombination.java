package Lecture20;

public class CoinCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		int amnt = 5;
		
		rec(arr,amnt,"",0);
	}

	public static void rec(int[] arr, int amnt, String ans,int idx) {
		// TODO Auto-generated method stub
		if(amnt == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < arr.length; i++) {
			if(amnt>= arr[i]) {
				rec(arr,amnt - arr[i], ans+arr[i],i);
			}
		}
	}

}
