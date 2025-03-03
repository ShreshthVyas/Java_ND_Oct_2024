package Lecture37;

public abstract class paymentgateway {
	
	public int fetchbalance() {
		return 1000000;
	}
	public abstract void payment();
	
	public abstract void f1();
	
	public static void main(String[] args) {
		paymentgateway pg = new paymentgateway() {
			
			@Override
			public void payment() {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println();
			}
		};
		paymentgateway pg1 = new paymentgateway(){
			
			@Override
			public void payment() {
				// TODO Auto-generated method stub
				System.out.println();
			}
			
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
