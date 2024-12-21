package Lecture18;

public class Subsequence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		subseq(s,"");
		
	}

	public static void subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch  = s.charAt(0);
		subseq(s.substring(1), ans); //exclusion
		subseq(s.substring(1),ans+ch);//inclusion
		
	}

}
