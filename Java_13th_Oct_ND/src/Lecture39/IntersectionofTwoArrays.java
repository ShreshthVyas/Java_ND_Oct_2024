package Lecture39;

import java.util.HashSet;

public class IntersectionofTwoArrays {
	public static void main(String[] args) {

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> temp= new HashSet<>();
		HashSet<Integer> ans= new HashSet<>();
		
		for (int i : nums1) {
			temp.add(i);
		}
		
		for (int i : nums2) {
			if(temp.contains(i)) {
				ans.add(i);
			}
		}
		
		int arr[] = new int[ans.size()];
		int i = 0;
		for (int j : ans) {
			arr[i++] = j;
		}
		
		return arr;
	}
}
