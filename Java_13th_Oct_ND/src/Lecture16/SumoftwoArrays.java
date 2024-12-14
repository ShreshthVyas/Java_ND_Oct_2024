package Lecture16;

import java.util.ArrayList;
import java.util.Scanner;

public class SumoftwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int brr[] = new int[m];
		
		for(int i = 0;i<brr.length;i++) {
			brr[i] = sc.nextInt();
		}
		
		int i = arr.length-1;
		int j = brr.length-1;
		ArrayList<Integer> list = new ArrayList<>();
		int carry =0;
		while(i>=0 && j>=0) {
			int sum = arr[i]+brr[j]+carry;
			list.addFirst(sum%10);
			carry = sum/10;
			i--;
			j--;
		}
		
		if(arr.length>brr.length) {
			while(i>=0) {
				int sum = arr[i]+carry;
				list.addFirst(sum%10);
				carry = sum/10;
				i--;
			}
		}
		else {
			while(j>=0) {
				int sum = brr[j]+carry;
				list.addFirst(sum%10);
				carry = sum/10;
				j--;
			}
		}
		
		if(carry>0) {
			list.addFirst(carry);
		}
		
		System.out.println(list);
	}

}
