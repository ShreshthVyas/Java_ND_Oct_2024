package Lecture46;

public class SingleNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] singleNumber(int[] nums) {
		int ans  = 0; 
		
		for (int i : nums) {
			ans = ans^i;
		}
		
		int mask =  ans & (~(ans-1));// guaranteed different single bit
		int a =0;
		for (int i : nums) {
			if((i^mask) !=0) {
				a = a^i;
			}
		}
		int b = a^ans;
		
		return new int[] {a,b};
		
	}

}
