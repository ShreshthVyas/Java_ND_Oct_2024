package Lecture37;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			activity arr[] = new activity[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new activity();
				arr[i].st = sc.nextInt();
				arr[i].et = sc.nextInt();
			}
			
			Arrays.sort(arr , new Comparator<activity>() {

				@Override
				public int compare(activity o1, activity o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
			
//			System.out.println(Arrays.toString(arr));
			int count =1;
			int cet = arr[0].et;
			
			for (int i = 1; i < arr.length; i++) {
				if(arr[i].st>= cet) {
					count++;
					cet = arr[i].et;
				}
			}
			
			System.out.println(count);
			
		}
		
		
	}
	
	public static class activity{
		int st;
		int et;
		
		public activity() {
			
		}
		@Override
		public String toString() {
			return st+ " " +et;
		}
	}

}
