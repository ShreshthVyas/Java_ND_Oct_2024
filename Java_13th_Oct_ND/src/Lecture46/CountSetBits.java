package Lecture46;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 127;
		int ans = countsetbitsfaster(n);
		
		System.out.println(ans);
	}

	private static int countsetbitsfaster(int n) {//O(No. of Set Bits)
		// TODO Auto-generated method stub
		int count = 0;
		
		while(n>0) {
			 n = n&n-1;
			 count++;
		}
		return count;
	}
	private static int countsetbits(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		
		while(n>0) {
			if((n&1) ==1) {
				count++;
			}
			n = n>>1;
		}
		
		return count;
	}

}
