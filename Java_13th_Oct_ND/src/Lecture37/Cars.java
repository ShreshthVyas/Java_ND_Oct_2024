package Lecture37;

public class Cars<T> implements Comparable<Cars>{
	
	int price;
	String name;
	int speed;
	
	public Cars(int p , String n , int s) {
		price = p;
		name = n;
		speed = s;
	}
	
	@Override
	public String toString() {
		return "name: " + this.name + " , price: " + this.price 
				+" , speed: " + this.speed;
	}



	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
//		return this.speed - o.speed;
//		return o.speed - this.speed;
		return this.name.compareTo(o.name);
	}
}
