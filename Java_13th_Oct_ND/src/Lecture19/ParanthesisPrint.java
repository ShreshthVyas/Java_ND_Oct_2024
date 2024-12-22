package Lecture19;

public class ParanthesisPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		print("",0,0,n);
	}

	public static void print(String ans, int op, int cl, int n) {
		// TODO Auto-generated method stub
		if(op>n || cl>n) { // -ve base case
			return;
		}
		if(op == n && cl==n) { // +ve base case
			System.out.println(ans);
			return;
		}
		
		print(ans+"(",op+1,cl,n);
		
		if(op>cl) {
			print(ans+")", op, cl+1, n);
		}
	}

}
