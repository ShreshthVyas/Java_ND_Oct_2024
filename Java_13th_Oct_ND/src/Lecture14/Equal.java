package Lecture14;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String t = "Hello";
		
//		if(s.length() == t.length()) {
//			
//		}
//		System.out.println(s.charAt(2));
		
		System.out.println(isequal(s,t));
		
		System.out.println(s.equals(t));
	}

	public static boolean isequal(String s, String t) {
		// TODO Auto-generated method stub
		if(s.length()!= t.length()) {
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
