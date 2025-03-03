package Lecture37;

public interface stackI {
	
	
	public void push();
	public void pop();
	public void peek();
	
//	protected int a;
	
	//java 8 
	static void f() {
		System.out.println();
	}
	
	default void f2() {
		
	}
	//java 9 
	private void f3() {
		
	}
	
	
	public static void main(String[] args) {
		stackI.f();
	}
}
