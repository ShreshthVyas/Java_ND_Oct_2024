package Lecture38;

public class HeapClient {
	
	public static void main(String[] args) {
		Heap pq =  new Heap();
		pq.add(4);
		pq.add(20);
		pq.add(7);
		pq.add(6);
		pq.add(31);
		pq.add(42);
		pq.add(2);
		pq.add(3);
		
		pq.Display();
		
		pq.remove();
		pq.Display();
		pq.remove();
		pq.Display();
	}
}
