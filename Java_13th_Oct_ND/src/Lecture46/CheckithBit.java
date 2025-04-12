package Lecture46;

public class CheckithBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int i =4;
		
		int mask = 1 << i;
		
		if((n & mask) != 0) {
			System.out.println("Bit Set");
		}
		else {
			System.out.println("Bit Not Set");
		}
		
	}

}
