package Lecture21;

import java.util.ArrayList;
import java.util.List;

public class PlaindromeLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 static List<List<String>> list = new ArrayList<>();
	 public static List<List<String>> partition(String s) {
	        palpart(new ArrayList<>(), s);
	        return list;
	 }
	 
	 public static void palpart(List<String> ans, String ques) {
			// TODO Auto-generated method stub
			if(ques.length()==0) {
				List<String> temp = new ArrayList<>(ans);
				
				list.add(temp);
				return;
			}
			
			for (int i = 1; i <=ques.length(); i++) {
				String s = ques.substring(0,i);
				if(isPalindrome(s)) {
					ans.add(s);
					palpart(ans, ques.substring(i));
					ans.remove(ans.size()-1);
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
