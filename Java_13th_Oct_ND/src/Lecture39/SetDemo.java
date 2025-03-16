package Lecture39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		HashSet<Integer> set = new HashSet<>();
//		set.add(10);
//		set.add(101);
//		set.add(103);
//		set.add(104);
//		set.add(10);
//		set.add(10);
//		set.add(10);
//		
//		System.out.println(set);
//		
//		System.out.println(set.contains(10));
//		System.out.println(set.contains(100));
//		
//		set.remove(101);
//		
//		System.out.println(set);
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(101);
		set.add(1030);
		set.add(104);
		set.add(10);
		set.add(10);
		set.add(10);
		
		System.out.println(set);
		
		System.out.println(set.contains(10));
		System.out.println(set.contains(100));
		
		set.remove(101);
		
		System.out.println(set);
//		LinkedHashSet<Integer> set = new LinkedHashSet<>();
//		set.add(10);
//		set.add(101);
//		set.add(103);
//		set.add(104);
//		set.add(10);
//		set.add(10);
//		set.add(10);
//		
//		System.out.println(set);
//		
//		System.out.println(set.contains(10));
//		System.out.println(set.contains(100));
//		
//		set.remove(101);
//		
//		System.out.println(set);

	}

}
