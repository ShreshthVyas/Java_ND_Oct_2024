package Lecture22;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 4;
		boolean board[][] = new boolean[n][n];
		queen(n,0,board,0);
	}

	public static void queen(int n, int qpsf, boolean[][] board, int row) {
		// TODO Auto-generated method stub
		if(qpsf == n) {
			Display(board);
			return;
		}
		if(row == n) {
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if(isItpossible(board,row,col)) {
				board[row][col] =true;
				queen(n, qpsf+1, board, row+1);
				board[row][col] =false;
			}
		}
		
	}

	public static boolean isItpossible(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		
		//upper half
		for (int r = 0; r < row; r++) {
			if(board[r][col]) {
				return false;
			}
		}
		
		//upper left diagonal
		int cr =row;
		int cc =col;
		
		while(cr>=0 && cc>=0) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc--;	
		}
		
		//upper right Diagonal
		cr =row;
		cc =col;
		while(cr>=0 && cc<board.length) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc++;	
		}
		return true;
	}

	private static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]) {
					System.out.print("Q ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
