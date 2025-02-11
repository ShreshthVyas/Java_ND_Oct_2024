package Lecture31;

public class LinkedList {
	
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
	
	public void addAtIdx(int v, int idx) {// O(N)
		int count =0;
		Node temp = head;
		while(count<idx-1) {
			temp = temp.next;
			count++;
		}
		
		Node nn = new Node(v,null);
		nn.next = temp.next;
		temp.next = nn;
		this.size++;
	}
	
	public void removeFirst() {//O(1)
		if(size==0) {
			return;
		}
		this.head = this.head.next;
		this.size--;
	}
	
	public void removeLast() { //O(N)
		if(size == 0) {
			return;
		}
		Node temp =this.head;
		while(temp.next!=this.tail) {
			temp = temp.next;
		}
		temp.next =null;
		this.tail = temp;
		this.size--;
	}
	
	public void removeatIdx(int idx) {
		int count =0;
		Node temp = head;
		while(count<idx-1) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
		this.size--;
	}
	
	public int getvalatIdx(int idx) {
		int count =0;
		Node temp = head;
		while(count<idx) {
			temp = temp.next;
			count++;
		}
		return temp.val;
	}
	
	public boolean linearsearch(int item) {
		Node temp = this.head;
		
		while(temp!=null) {
			if(temp.val == item) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public void Middle() {
		int count  = 0;
		Node temp = this.head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		temp = this.head;
		int i = 0;
		while(i<count/2) {
			temp = temp.next;
			i++;
		}
		
//		int i =0;
//		while()
		System.out.println(temp.val);
	}
	
	
	
	
}
