package Lecture14;

public class Printallsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		printall(s);
	}

	public static void printall(String s) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < s.length(); i++) { //starting point
			for (int j = i+1; j <= s.length(); j++) { //ending point
				System.out.print(s.substring(i,j)+ " , ");
			}
			System.out.println();
		}
	}

}
