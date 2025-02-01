package Lecture28;

import java.util.Stack;

public class InsertAtBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack<>(); 
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		insertatbottom(st,60);
		System.out.println(st);
		
	}

	private static void insertatbottom(Stack<Integer> st, int i) {
		// TODO Auto-generated method stub
		Stack<Integer>  s = new Stack<>();
		
		while(!st.isEmpty()) {
			s.push(st.pop());
		}
		st.push(i);
		while(!s.isEmpty()) {
			st.push(s.pop());
		}
		
	}

}
