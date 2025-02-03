package Lecture29;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] [] =  new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Stack<Integer>  st = new Stack<>();
		
		int ans = celeb(st,arr);
		if(ans ==-1) {
			System.out.println("No Celeb");
		}
		else {
			System.out.println(ans);
		}
		
	}

	private static int celeb(Stack<Integer> st, int[][] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) { 
			st.push(i);
		}
		
		while(st.size()>1) {
			int a = st.pop();
			int b= st.pop();
			if(arr[a][b] ==1) { // a knows b
				st.push(b);
			}
			else {
				st.push(a);
			}
		}
		
		int a = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if(i == a) {
				continue;
			}
			if(arr[a][i] ==1) {
				return -1;
			}
			if(arr[i][a]==0) {
				return -1;
			}
		}
		
		return a;
		
	}

}
