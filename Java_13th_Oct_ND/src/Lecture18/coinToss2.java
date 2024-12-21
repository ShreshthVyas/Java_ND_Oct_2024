package Lecture18;

public class coinToss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;

		coin("", n);
	}

	public static void coin(String ans, int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			coin(ans + "H", n - 1);
		}
		coin(ans + "T", n - 1);
	}

}
