package Lecture37;

public class Pair <K,V> {
	K key;
	V val;
	public Pair() {
		
	}
	public Pair(K key , V value) {
		this.key = key;
		this.val = value;			
	}
	
	public void Display() {
		System.out.println(key + " - " + val);
	}
	
	
	public static void main(String[] args) {
		Pair<Integer, Integer> p = new Pair<>(10,20);
		p.Display();
		Pair<Integer, String> p1 = new Pair<>(10,"A");
		p1.Display();
		Pair<Integer, Double> p2 = new Pair<>(10,20.2);
		p2.Display();
		Pair<String, Integer> p3 = new Pair<>("B",20);
		p3.Display();
		
	}
}
