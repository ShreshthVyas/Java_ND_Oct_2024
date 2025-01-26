package Lecture27;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.Display();
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
//		System.out.println(st.isEmpty());
//		System.out.println(st.isFull());
		st.Display();
		st.pop();
		System.out.println("....");
		st.Display();
		
		System.out.println(st.peek());
		st.clear();
		st.Display();
		
		
		
	}

}
