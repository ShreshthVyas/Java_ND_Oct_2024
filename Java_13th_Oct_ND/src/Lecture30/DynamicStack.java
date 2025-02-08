package Lecture30;

import Lecture27.Stack;

public class DynamicStack extends Stack{
	
	@Override
	public void push(int item) throws Exception  {
		if(isFull()) {
			int newarr[] = new int[arr.length*2];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		super.push(item);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack dq = new DynamicStack();
		dq.push(10);
		dq.push(20);
		dq.push(10);
		dq.push(10);
		dq.push(10);
		dq.push(10);
		dq.push(10);
		dq.push(10);
		dq.push(10);
		dq.push(10);
		dq.push(10);
		dq.Display();
	}

}
