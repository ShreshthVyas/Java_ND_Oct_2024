package Lecture18;

public class SubsequenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		int count = subseq(s,"");
		System.out.println(count);
		
	}

	public static int subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		char ch  = s.charAt(0);
		int inc = subseq(s.substring(1), ans); //exclusion
		int exc = subseq(s.substring(1),ans+ch);//inclusion
		return inc +exc;
		
	}

}
