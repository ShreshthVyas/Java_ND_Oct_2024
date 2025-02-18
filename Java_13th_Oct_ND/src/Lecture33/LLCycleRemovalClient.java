package Lecture33;

public class LLCycleRemovalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLCycleRemoval ll = new LLCycleRemoval();
		ll.addFirst(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.Display();
		ll.CreateCycle();
//		ll.CycleRemoval();
//		ll.RemoveCycleOptimised();
		ll.FloydCycleRemoval();
		ll.Display();
	}

}
