package Lecture13;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1==s2);
		
		String s =  new String();
		s = "Hello";
		
		System.out.println(s==s1);
		
		String s3 =  new String("Hello");
		
		System.out.println(s1 == s3);
		
		System.out.println(s==s3);
		
	}
}
