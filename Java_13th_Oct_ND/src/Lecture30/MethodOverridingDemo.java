package Lecture30;

import java.util.ArrayList;

public class MethodOverridingDemo {
	@Override
	public String toString() {
        return "MethodOverriding";
    }
	public void f() {
		System.out.println("Hello in p");
	}
	public static void main(String[] args) {
		MethodOverridingDemo md = new MethodOverridingDemo();
//		md.f();
		ArrayList<Integer> list = new ArrayList<>();
		String s = new String();
		System.out.println(md);
		
	}

}
