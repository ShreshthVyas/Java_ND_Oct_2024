package Lecture38;

import java.util.PriorityQueue;

public class kthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.offer(nums[i]);
		}
		for (int i = k; i < nums.length; i++) {
			if(nums[i] > pq.peek()) {
				pq.poll();
				pq.offer(nums[i]);
			}
		} 
		return pq.poll();
	}

}
