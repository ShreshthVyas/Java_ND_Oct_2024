package Lecture18;

public class staticDemo {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		subseq(s,"");
		System.out.println(count);
		
	}

	public static void subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch  = s.charAt(0);
		subseq(s.substring(1), ans); //exclusion
		subseq(s.substring(1),ans+ch);//inclusion
	}

}
