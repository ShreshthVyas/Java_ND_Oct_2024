package Lecture39;

import java.util.ArrayList;

public class Hashmap<K,V> {
	
	public class Node{
		K key;
		V val;
		Node next;
	}
	
	private ArrayList<Node> bckt;
	private int size = 0;
	public Hashmap() {
		bckt =  new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			bckt.add(null);
		}
	}
	public Hashmap(int n) {
		bckt =  new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bckt.add(null);
		}
	}
	
	public void put(K key, V value) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		while(curr!=null) { // if already present
			if(curr.key.equals(key)) {
				curr.val = value;
				return;
			}
			curr= curr.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.val = value;
		Node temp = bckt.get(idx);
		nn.next = temp;
		bckt.set(idx, nn);
		this.size++;
		double thf = 2.0;// Maximum node per bckt allowed
		double lf = (1.0 * this.size) / bckt.size();// current nodes per bckt
		if(lf>thf) {
			rehashing();
		}
		
	}
	
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> temp = new ArrayList<>();
		for (int i = 0; i < 2*bckt.size(); i++) {
			temp.add(null);
		}
		ArrayList<Node> ll = bckt;
		this.bckt = temp;
		
		for (Node node : ll) {
			while(node!=null) {
				put(node.key,node.val);
				node = node.next;
			}
		}
		
		
	}
	public V remove(K key) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		Node prev = null;
		while(curr!=null) { 
			if(curr.key.equals(key)) { // node found
				break;
			}
			prev =curr;
			curr= curr.next;
		}
		
		if(curr == null) {
			return null;
		}
		else if(prev == null) {
			bckt.set(idx, curr.next);
			curr.next = null;
		}
		else {
			prev.next = curr.next;
			curr.next = null;
		}
		this.size--;
		return curr.val;
	}
	
	public boolean containsKey(K key) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		while(curr!=null) { 
			if(curr.key.equals(key)) { // node found
				return true;
			}
			curr= curr.next;
		}
		return false;
	}
	
	private int hashfunc(K key) {
		int idx = key.hashCode()%bckt.size();
		
		if(idx<0) {
			idx+= bckt.size();
		}
		return idx; 
	}
	
	@Override
	public String toString() {
		String s = "{ ";
		for (Node node : bckt) {
			while(node!=null) {
				s+= node.key +" ==> " + node.val +", ";
				node = node.next;
			}
		}
		return s + " }";
	}
	

}
