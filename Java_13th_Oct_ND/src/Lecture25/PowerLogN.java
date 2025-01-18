package Lecture25;

public class PowerLogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(3,4));
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 1) {
			return a;
		}
		int ans  = pow(a,b/2);
		ans *= ans;
		if(b%2==1) {
			ans*=a;
		}
		return ans;
	}


}
