package Lecture29;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 5, 6, 2, 3 };

	}

	public int largestRectangleArea(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans =0;
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i]<=arr[st.peek()]) {
				int h = arr[st.pop()];
				if(st.isEmpty()) {
					int w =i;
					ans = Math.max(ans, h*w);
				}
				else {
					int p = st.peek();
					int w = i-p-1;
					ans = Math.max(ans, h*w);
				}
			}
			st.push(i);
		}
		int i = arr.length;
		
		while(!st.isEmpty()) {
			int h = arr[st.pop()];
			if(st.isEmpty()) {
				int w =i;
				ans = Math.max(ans, h*w);
			}
			else {
				int p = st.peek();
				int w = i-p-1;
				ans = Math.max(ans, h*w);
			}
		}
		return ans;
	}

}
