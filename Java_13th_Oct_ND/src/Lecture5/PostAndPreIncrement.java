package Lecture5;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int i =2;
//		int c = 10 + ++i;
//		int d = 20 + i++;
//		
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(i);
		
		System.out.println(a++ + 19 + ++i + --i + a-- + 12 + ++a);
		System.out.println(a);
		System.out.println(i);
	}

}
