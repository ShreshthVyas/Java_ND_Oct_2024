package Lecture32;

import java.util.Stack;

public class LinkedListReverseUsingStack {

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
	
	 public ListNode reverseList(ListNode head) {
	        if(head == null){
	            return null;
	        }
	        Stack<ListNode> st = new Stack<>();
	        
	        while(head!=null){
	            st.push(head);
	            head = head.next;
	        }

	        head = st.pop();
	        ListNode temp = head;
	        while(!st.isEmpty()){
	            temp.next = st.pop();
	            temp = temp.next;
	        }
	        temp.next = null;
	        return head;
	    }

}
