package Lecture15;

import java.util.Scanner;

public class Moore_MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		 int count = 0;
	        int ans  = 0;
	        for(int i = 0; i<arr.length; i++){
	            if(count  == 0){
	                ans = arr[i];
	            }
	            if(ans == arr[i]){
	                count++;
	            }
	            else{
	                count--;
	            }
	        }
	        System.out.println(ans);
	}
	

}
