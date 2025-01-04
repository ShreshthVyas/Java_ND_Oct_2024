package Lecture21;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palpart("","aab");
	}

	public static void palpart(String ans, String ques) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 1; i <=ques.length(); i++) {
			String s = ques.substring(0,i);
			if(isPalindrome(s)) {
				palpart(ans+s+" | ", ques.substring(i));
			}
		}
		
	}

	public static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i =0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	

}
