package Lecture27;

public class Queue {
	// All major function O(1)
	private int []arr;
	private int front =0;
	private int size = 0;
	
	public Queue() {
		this.arr = new int[5];
	}
	public Queue(int size) {
		this.arr = new int[size];
	}
	
	public boolean isEmpty() {
		return this.size ==0;
	}
	public boolean isFull() {
		return this.size == arr.length;
	}
	
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Q is full");
		}
		int idx = (this.front+this.size)% arr.length;
		arr[idx] = item;
		this.size++;
	}
	
	public int Deque() throws Exception {
		if(isEmpty()) {
			throw new Exception("Q id empty");
		}
		int temp = arr[front];
		arr[front] = 0;
		front = (front+1)%arr.length;
		this.size--;
		return temp;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Q id empty");
		}
		return arr[front];
	}
	
	public void Display() {
		for (int i = 0; i < this.size; i++) {
			int idx = (front+i) % arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
	
	public void clear() {
		 
		for (int i = 0; i < this.size; i++) {
			int idx = (front+i) % arr.length;
			arr[idx] = 0;	
		}
		this.size=0;
		this.front =0;
		
	}

}
