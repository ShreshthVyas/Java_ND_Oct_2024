package Lecture16;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
//		ArrayList<String> list1 = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.addFirst(10);
		list.addLast(30);
		
		list.add(2, 40);
		
		
		
		list.set(2, 50);
		
		list.remove(1);
		for (Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println(list.size());
		
		int a = list.get(0);
		
		System.out.println(a);
		
		list.contains(3);
		
		Collections.sort(list); //sort
		
		Collections.reverse(list);
		
		System.out.println(list);
		
	}

}