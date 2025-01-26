package Lecture27;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		System.out.println(q.isFull());
		
		q.Deque();
		q.Deque();
		q.Display();
		
		q.Enqueue(60);
		q.Display(); 
	}

}
