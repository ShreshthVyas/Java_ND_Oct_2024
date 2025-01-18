package Lecture25;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si =10;
		int ei = 100;
		Random rn = new Random();
		
		for (int i = 0; i < 30; i++) {
			int v = rn.nextInt(ei-si+1) + si;
			System.out.print(v + " ");
		}
	}

}
