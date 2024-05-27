package day06;

public class TicTacToe3 {

	public static void main(String[] args) {
		char[] board = {' ', 'X', ' ', 'X', 'O', 'X', 'O', ' ', 'O'};
		printBoard(board);
		System.out.println("======");
		//請問 o可以放在那些地方獲勝
		board[0]= 'O';  //board[2]= 'O'; board[7]= 'O';
		printBoard(board);
		

	}
	
	private static void printBoard(char[] board) {
		// 請印出 board 井字遊戲棋盤模式
		for(int i=0; i<board.length; i++) {
			System.out.print(board[i] + " ");
			
			if(i % 3 == 2) {
				System.out.println();
			}
		}
	}

}
