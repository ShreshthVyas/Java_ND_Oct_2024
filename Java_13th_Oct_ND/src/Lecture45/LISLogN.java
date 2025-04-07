package Lecture45;

public class LISLogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLIS(int[] nums) {
		int lis[] = new int[nums.length];
		lis[0] = nums[0];
		int ans = 1;
		
		for (int i = 1; i < lis.length; i++) {
			if(nums[i]> lis[ans-1]) {
				lis[ans] = nums[i];
				ans++;
			}
			else {
				int idx = binarysearch(0,ans-1,lis,nums[i]);
				lis[idx] = nums[i];
			}
		}
		
		return ans;
	}

	private int binarysearch(int i, int j, int[] lis, int k) {
		// TODO Auto-generated method stub
		int idx =0;
		while(i<=j) {
			int mid = (i+j)/2;
			if(lis[mid]>=k) {
				idx = mid;
				j = mid-1;
			}
			else {
				i = mid+1;
			}
		}
		return idx;
	}

}
