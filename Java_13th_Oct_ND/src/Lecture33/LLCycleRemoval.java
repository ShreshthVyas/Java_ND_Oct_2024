package Lecture33;

public class LLCycleRemoval {
	
	public class Node{
		int val;
		Node next;
		
		public Node() {
			this.val = -1;
			this.next = null;
		}
		public Node(int v, Node n) {
			this.val = v;
			this.next = n;
		}
	}
	
	private Node head;
	private Node tail;
	private int size =0;
	
	public void addFirst(int i) { //O(1)
		if(this.size == 0) { //empty
			this.head = new Node();
			this.head.val = i;
			this.tail = this.head;
			this.size++;
		}
		else {
			Node nn = new Node();
			nn.next = this.head; 
			nn.val = i;
			this.head  =nn;
			this.size++;
		}
	}
	
	public void addLast(int i) { // O(1)
		if(size==0) {
			addFirst(i);
		}
		else {
			Node nn = new Node(i,null);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}
	
	public void Display() {
		Node n = this.head;
		while(n!=null) {
			System.out.print(n.val+" ==>");
			n = n.next;
		}
		System.out.println("END");
	}
	
	public void CreateCycle() {
		tail.next = head.next.next;
	}
	
	public Node MeetPoint() {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) {
				return slow;
			}
		}
		
		return null;
	}
	//O(n^2)
	public void CycleRemoval() {
		Node mp = MeetPoint();
		if(mp == null) {
			return;
		}
		
		Node temp = this.head;
		while(temp!=null) {
			Node a = mp;
			while(a.next!=mp) { //check temp is present in cycle or not
				if(a.next==temp) { //starting point found
					a.next = null;
					return;
				}
				a = a.next;
			}
			temp = temp.next;
		}
		
	}
	
	// O(N)
	public void RemoveCycleOptimised() {
		Node mp = MeetPoint();
		if(mp == null) {
			return;
		}
		
		int count = 1;
		Node a = mp;
		
		// calculate cycle length
		while(a.next!=mp) {
			count++;
			a = a.next;
		}
		Node slow = head;
		Node fast = head;
		//Move fast cycle length times
		for (int i = 0; i <count; i++) {
			fast = fast.next;
		}
		
		// Move Fast and Slow simaltaneously
		while(fast.next!=slow.next) {
			fast = fast.next;
			slow = slow.next;
		}
		
		fast.next = null;
	}
	
	// O(N)
	public void FloydCycleRemoval() {
		Node mp = MeetPoint();
		if(mp == null) {
			return;
		}
		
		Node fast = mp;
		Node slow = this.head;
		while(fast.next!=slow.next) {
			fast = fast.next;
			slow = slow.next;
		}
		
		fast.next = null;
	}
}
