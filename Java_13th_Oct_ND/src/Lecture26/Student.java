package Lecture26;

public class Student {
	int id;
	String name;
	
	
//	public Student() {
//		
//	}
//	public Student(int i) {
//		id = i;
//	}
	public Student(int id, String name) {
		this.id  = id;
		this.name = name;
	}
	public void greet(String name) {
		System.out.println(this.name + " says hello to " + name );
	}
}
