package Lecture26;

public class Person {
	int age;
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	static int count= 1;
//	public Person(int id, String name) {
//		// TODO Auto-generated constructor stub
//		this.name = name;
//		this.age = id;
//	}

	public  void greet(String name) {
		System.out.println(this.name + " says hello to " + name );
	}
	
	public static void g() {
		System.out.println("greet");
	}
	
	static {
		System.out.println("hello from static");
	}
	
	public int getage() {
		return this.age;
	}
	public void setage(int age) throws Exception  {
		try {
			if(age<0) {
				throw new Exception("Unpadh age is not -ve");
			}
			else {
				this.age =age;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		if(age<0) {
			throw new Exception("Unpadh age is not -ve");
		}
//		this.age =age;
	}
	
	
}


