package Lecture10;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int firstBadVersion(int n) {
		int i = 1;
		int j = n;
		int ans = -1;
		while(i<=j) {
			int mid = (i+j) / 2;
			if(isBadVersion(mid)) {
				ans = mid;
				j = mid - 1;
			}
			else {
				i = mid+1;
			}		
		}
		return ans;
		
	}
	
	public static boolean isBadVersion(int n) {
		return true;
	}
	
	
	

}
