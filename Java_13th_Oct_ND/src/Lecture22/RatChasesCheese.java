package Lecture22;

import java.util.Arrays;
import java.util.Scanner;

public class RatChasesCheese {
	static boolean flag = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m  = sc.nextInt();
		
		char arr[][] = new char[n][m];
		
//		char ch = sc.next().charAt(0);
		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int ans[][] = new int[n][m];
		
		rec(0,0,n,m,ans,arr);
		
		if(!flag) {
			System.out.println("No Path Found");
		}
		
	}

	public static void rec(int cr, int cc,int n,int m, int[][] ans, char[][] arr) {
		// TODO Auto-generated method stub
		if(cr<0 || cc<0 || cr>=n || cc>=m || arr[cr][cc] == 'X') {
			return;
		}
		if(cr == n-1 && cc == m-1 && arr[cr][cc] != 'X') {
			flag = true;
			ans[cr][cc] = 1;
			Display(ans);
			ans[cr][cc] = 0;
			return;
		}
		arr[cr][cc] = 'X';
		ans[cr][cc] = 1;
		rec(cr, cc+1, n, m, ans, arr);
		rec(cr+1, cc, n, m, ans, arr);
		rec(cr, cc-1, n, m, ans, arr);
		rec(cr-1, cc, n, m, ans, arr);
		arr[cr][cc] = 'O';
		ans[cr][cc] = 0;
		
		
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		
		for (int[] is : ans) {
			System.out.println(Arrays.toString(is));
		}
		
	}

}
