package Lecture14;

public class PrintAllPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbaaa";
		printall(s);
		
	}
	public static void printall(String s) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < s.length(); i++) { //starting point
			for (int j = i+1; j <= s.length(); j++) { //ending point
				if(isPal(s.substring(i,j))) {
					System.out.println(s.substring(i,j));
				}
			}
		}
	}
	public static boolean isPal(String s) {
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
