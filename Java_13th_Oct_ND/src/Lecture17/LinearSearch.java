package Lecture17;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,3,4,-2,-5,7,11};
		System.out.println(ls(arr,-11,0));
		
	}

	public static int ls(int[] arr, int target,int idx) {
		// TODO Auto-generated method stub
		if(idx == arr.length) {
			return -1;
		}
		if(arr[idx] == target) {
			return idx;
		}
		
		return ls(arr,target,idx+1);
		
	}

}
