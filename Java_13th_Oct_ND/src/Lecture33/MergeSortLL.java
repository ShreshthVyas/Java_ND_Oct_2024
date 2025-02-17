package Lecture33;

public class MergeSortLL {

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

	public ListNode mergeTwoLists(ListNode A, ListNode B) {
		ListNode newhead = new ListNode();
		ListNode temp = newhead;

		while (A != null && B != null) {
			if (A.val < B.val) {
				temp.next = A;
				A = A.next;
				temp = temp.next;
			} else {
				temp.next = B;
				B = B.next;
				temp = temp.next;
			}
		}

		if (A== null) {
			temp.next = B;
		}
		if (B == null) {
			temp.next = A;
		}

		return newhead.next;
	}

	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;

	}

	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode mid = middleNode(head);
		ListNode sh = mid.next;
		mid.next = null;
		ListNode A = sortList(head);
		ListNode B = sortList(sh);
		
		return mergeTwoLists(A, B);
		
		
	}

}
