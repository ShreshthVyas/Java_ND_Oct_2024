package Lecture14;

public class AllSusbtring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abcd";
		 printall(s);
	}

	public static void printall(String s) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= s.length(); i++) { //length
			for (int j = 0; j <= s.length()-i; j++) {
				System.out.print(s.substring(j,j+i) + " ");
			}
			System.out.println();
		}
	}

}
