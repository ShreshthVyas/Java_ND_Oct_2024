package Lecture27;

import java.util.Arrays;

public class Stack {
	
	protected int arr[];
	protected int top =-1;
	
	public Stack() {
		arr= new int[5];
	}
	public Stack(int size) {
		arr = new int[size];
	}
	
	//O(1)
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	//O(1)
	public boolean isFull() {
		if(top==arr.length-1) {
			return true;
		}
		return false;
	}
	
	//O(1)
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full");
		}
		top++;
		arr[top] = item;
	}
	
	//O(N)
	public void Display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return;
		}
		for (int i = top; i>=0; i--) {
			System.out.println(this.arr[i]);
		}
	}
	
	//O(1)
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int temp = arr[top];
		arr[top] = 0;
		top--;
		return temp;
	}
	
	//O(1)
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return arr[top];
	}
	
	//O(1)
	public int length() {
		return top+1;
	}
	
	//O(N)
	public void clear() {
		for (int i = top; i>=0; i--) {
			this.arr[i] =0;
		}
		top =-1;
//		Arrays.fill(arr, 0);
//		this.arr = new int[5];
		
	}

}
