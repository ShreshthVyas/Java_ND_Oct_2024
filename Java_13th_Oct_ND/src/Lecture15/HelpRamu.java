package Lecture15;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int c1 =sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			
			int nor = sc.nextInt();
			int noc = sc.nextInt();
			
			int rick [] = new int[nor];
			int cab[] = new int[noc];
			
			for (int i = 0; i < rick.length; i++) {
				rick[i] = sc.nextInt();
			}
			
			for (int i = 0; i < cab.length; i++) {
				cab[i] = sc.nextInt();
			}
			
			int Rick_Min = compare(c1,c2,c3,rick);
			int Cab_Min = compare(c1, c2, c3, cab);
			
			int ans = Math.min(Cab_Min+Rick_Min, c4);
			
			System.out.println(ans);
			
		}
		
	}

	public static int compare(int c1, int c2, int c3, int[] arr) {
		// TODO Auto-generated method stub
		int sum =0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+= Math.min(arr[i]*c1, c2);
		}
		return Math.min(sum, c3);
	}

}
