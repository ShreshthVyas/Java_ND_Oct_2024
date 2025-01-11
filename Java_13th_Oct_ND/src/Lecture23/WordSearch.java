package Lecture23;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]== word.charAt(0)) {
					boolean ans =rec(i,j,board,word,0);
					if(ans) {
						return true;
					}
				}
			}
		}
        return false;
    }
	public static boolean rec(int i, int j, char[][] board, String word, int idx) {
		// TODO Auto-generated method stub
		if(idx == word.length()) {
			return true;
		}
		if(i<0 || j<0 || i== board.length||j == board[0].length || board[i][j] != word.charAt(idx) ) {
			return false;
		}
		board[i][j] = '*';
		int row[] = { 0,1,0,-1};
		int col[] = {1,0,-1,0};
		for (int k = 0; k < col.length; k++) {
			boolean ans = rec(i+row[k], j+col[k], board, word, idx+1);
			if(ans) {
				return true;
			}
		}
		board[i][j] = word.charAt(idx);
		
		return false;
	}

}
