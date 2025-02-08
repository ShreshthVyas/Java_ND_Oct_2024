package Lecture30;

import Lecture27.Queue;

public class DynamicQueue extends Queue{
	
	@Override
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int newarr[] = new int[arr.length*2];
			for (int i = 0; i < this.size; i++) {
				int idx = (front+i) % arr.length;
				newarr[i] = arr[idx];
			}
			arr = newarr;
		}
		super.Enqueue(item);
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue q = new DynamicQueue();
		q.Enqueue(10);
		q.Enqueue(0);
		q.Enqueue(0);
		q.Enqueue(0);
		q.Enqueue(0);
		q.Enqueue(0);
		q.Enqueue(0);
		q.Enqueue(0);
		q.Enqueue(20);
		
		q.Display();
	}

}
