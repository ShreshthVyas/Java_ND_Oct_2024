package Lecture28;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack<>(); 
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println(">>>>>>");
		reverse(st);
		System.out.println(st);
	}

	private static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int n = st.pop();
		reverse(st);
		insertatbottom(st, n);
	}
	private static void insertatbottom(Stack<Integer> st, int i) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(i);
			return;
		}
		int n = st.pop();
		insertatbottom(st, i);
		st.push(n);
		
	}

}
