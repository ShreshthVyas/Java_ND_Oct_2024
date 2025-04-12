package Lecture46;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		int n = s.length();
		for (int i = 0; i < (1<<n); i++) {
			subsequence(s,i);
		}
		
	}

	private static void subsequence(String s, int i) {
		// TODO Auto-generated method stub
		int pos =0;
		
		while(i>0) {
			if((i&1) == 1) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i>>=1;//i = i>>1;
		}
		System.out.println();
	}

}
