package Lecture39;

public class HashMapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<Integer,Integer> map = new Hashmap<>();
		map.put(10, 10);
		map.put(20, 10);
		map.put(30, 10);
		map.put(40, 10);
		map.put(50, 10);
		map.put(100, 10);
		map.put(200, 10);
		map.put(300, 10);
		map.put(400, 10);
		map.put(500, 10);
		map.put(600, 10);
		map.put(700, 10);
		
		System.out.println(map);
		
		System.out.println(map.remove(20));
		System.out.println(map);
		
		System.out.println(map.containsKey(30));
		System.out.println(map.containsKey(20));
	}

}
