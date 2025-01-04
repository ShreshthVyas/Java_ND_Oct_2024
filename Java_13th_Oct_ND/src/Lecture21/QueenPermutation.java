package Lecture21;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[] = new boolean[4];
		queen(board,2,0,"");
	}

	public static void queen(boolean[] board, int noq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if(qpsf == noq) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < board.length; i++) {
			if(!board[i]) {
				board[i] = true;
				queen(board, noq, qpsf+1, ans+"q"+qpsf+"b"+i);
				board[i] = false;// Backtracking
			}
		}
		
		
		
	}

}
