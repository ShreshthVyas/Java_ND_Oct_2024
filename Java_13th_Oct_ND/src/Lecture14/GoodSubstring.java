package Lecture14;

public class GoodSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaeicdeaaaeiou";
		int ans = 0;
		int count= 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count = 0;
			}
		}
		ans = Math.max(ans, count);
		System.out.println(ans);
	}

	public static boolean isVowel(char d) {
		// TODO Auto-generated method stub
		if(d=='a'|| d=='e' || d=='i'||d=='o'|| d=='u') {
			return true;
		}
		return false;
	}

}
