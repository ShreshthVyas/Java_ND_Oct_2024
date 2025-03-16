package Lecture38;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> pq = new PriorityQueue<>();//Min Heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(1000000);
		pq.add(100);
		pq.add(101);
		pq.add(11);
		pq.add(103);
		pq.add(1000);
		
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.peek());
		
		
		
	}

}
