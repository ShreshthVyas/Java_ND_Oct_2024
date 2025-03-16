package Lecture38;

import java.util.Comparator;
import java.util.PriorityQueue;

import Lecture32.DetectCycleLeetcode.ListNode;

public class MergeKSortedList {
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {

	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq =new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		});
		for (ListNode node : lists) {
			if(node!=null) {
				pq.offer(node);
			}
			
		}
		
		ListNode dummyHead = new ListNode();
		ListNode temp = dummyHead;
		
		while(!pq.isEmpty()) {
			ListNode nn = pq.poll();
			temp.next = nn;
			temp= temp.next;
			if(nn.next!=null) {
				pq.offer(nn.next);
			}
		}
		return dummyHead.next;	
	}
}
