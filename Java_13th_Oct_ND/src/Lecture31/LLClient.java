package Lecture31;

public class LLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addLast(20);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addLast(70);
		ll.Display();
//		ll.addFirst(100);
//		ll.Display();
//		ll.addAtIdx(200, 3);
//		ll.removeFirst();
//		ll.removeLast();
//		ll.removeatIdx(2);
//		ll.Display();
//		System.out.println(ll.linearsearch(40));
		ll.Middle();
	}

}
