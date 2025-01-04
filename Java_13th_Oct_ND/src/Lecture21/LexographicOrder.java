package Lecture21;

public class LexographicOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1000;
		lexographic(0,n);
	}

	public static void lexographic(int ans, int n) {
		// TODO Auto-generated method stub
		if(ans>n) {
			return;
		}
		System.out.println(ans);
		int i =0;
		if(ans == 0) {
			i =1;
		}
		for (; i <=9; i++) {
			lexographic(ans*10 +i, n);
		}
		
	}

}
