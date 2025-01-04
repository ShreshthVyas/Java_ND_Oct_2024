package Lecture21;

public class QueenCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[] = new boolean[4];
		queen(0,board,2,0,"");
	}

	public static void queen(int idx, boolean[] board, int noq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if(qpsf == noq) {
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < board.length; i++) {
			if(!board[i]) {
				board[i] = true;
				queen(i+1,board, noq, qpsf+1, ans+"q"+"b"+i);
				board[i] = false;// Backtracking
			}
		}
	}

}
