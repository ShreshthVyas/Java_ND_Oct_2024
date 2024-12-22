package Lecture19;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int m = 3;
		
		int ans  = board("",0,n,m);
		System.out.println(ans);
	}

//	public static void board(String ans, int sum, int n, int m) {
//		// TODO Auto-generated method stub
//		if(sum>n) {
//			return;
//		}
//		if(sum == n) {
//			System.out.println(ans);
//			return;
//		}
//		
//		board(ans+"1", sum+1, n, m);
//		board(ans+"2", sum+2, n, m);
//		board(ans+"3", sum+3, n, m);
//		board(ans+"4", sum+4, n, m);
//		
//	}
	
//	public static void board(String ans, int sum, int n, int m) {
//		// TODO Auto-generated method stub
//		if(sum>n) {
//			return;
//		}
//		if(sum == n) {
//			System.out.println(ans);
//			return;
//		}
//		
//		for (int i = 1; i <=m; i++) {
//			board(ans+i, sum+i, n, m);
//		}
//		
//	}
	
	public static int board(String ans, int sum, int n, int m) {
		// TODO Auto-generated method stub
		if(sum>n) {
			return 0;
		}
		if(sum == n) {
			System.out.println(ans);
			return 1;
		}
		int count  =0;
		for (int i = 1; i <=m; i++) {
			count+= board(ans+i, sum+i, n, m);
		}
		return count;
	}

}
