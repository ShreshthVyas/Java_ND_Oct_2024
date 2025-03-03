package Lecture37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c[] = new Cars[5];
		
		c[0] = new Cars(1000, "corolla", 140);
		c[1] = new Cars(1000, "ertiga", 120);
		c[2] = new Cars(989, "mahindra", 160);
		c[3] = new Cars(-40, "punch", 300);
		c[4] = new Cars(960, "sonet", 323);
		
//		sort(c);
		
		Arrays.sort(c, new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
//				return o1.speed - o2.speed;
				if(o1.price == o2.price) {
					return o1.speed - o2.speed;
				}
				return o1.price - o2.price;
			}
		});
		ArrayList<Cars>  list = new ArrayList<>(); 
		
		Collections.sort(list , new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.speed- o2.speed;
			}
		});
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

//	private static <T extends Comparable<T>> void sort(T[] arr) {
//		// TODO Auto-generated method stub
//		for (int pass = 1; pass < arr.length; pass++) {
//			for (int j = 0; j < arr.length-pass; j++) {
//				if(arr[j].compareTo(arr[j+1])>0) {
//					T temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//	}
	
	

}
