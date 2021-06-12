package com.bridgelabz.TicTacToe;

public class TicTacToe {
	public static char[] createBoard() { // created board of size 10
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) {
			// assign empty space to each element and start it from position 1
			board[i] = ' ';
		}
		return board;
	}

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the TicTacToe game");
		createBoard();// call the method in main class
	}

}
