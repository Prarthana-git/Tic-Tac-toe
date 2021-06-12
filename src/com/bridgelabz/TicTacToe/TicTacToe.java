package com.bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	private char[] board = new char[10];
	char player;
	char computer = ' ';

	public void createBoard() { // created board of size 10
		for (int i = 1; i < 9; i++) {
			// assign empty space to each element and start it from position 1
			board[i] = ' ';
		}
	}

	// make choice for x or o
	public void makeChoice() {//user input
		System.out.println("Enter What You Want X or O");
		Scanner obj = new Scanner(System.in);
		player = obj.next().charAt(0);
      //getting the value from user
		if (player == 'X' || player == 'x') {
			computer = 'O';
			System.out.println("Computer:" + computer);
		} else if (player == 'O' || player == 'o') {
			computer = 'X';
			System.out.println("Computer:" + computer);
		} else {
			System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the TicTacToe game");
		TicTacToe tictactoe = new TicTacToe();
		tictactoe.createBoard();// call the method in main class
		tictactoe.makeChoice();
	}
}
