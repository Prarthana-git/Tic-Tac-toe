package com.bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	private static char[] board= new char[10]; 
	char player;
	char computer = ' ';

	public void createBoard() { // created board of size 10
		for (int i = 1; i < 9; i++) {
			// assign empty space to each element and start it from position 1
			board[i] = ' ';
		}
	}

	// make choice for x or o
	public void makeChoice() {// user input
		System.out.println("Enter What You Want X or O");
		Scanner obj = new Scanner(System.in);
		player = obj.next().charAt(0);
		// getting the value from user
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

	public void showBoard(char[] board) {
		System.out.println("\n" + board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("-------------");
		System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("-------------");
		System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
	}

	public void makeMove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Position");
		int i = sc.nextInt();
			if (board[i] == ' ') {
				board[i] = player;
			} else {
				System.out.println("Already occupied");
			}
		}
		public static void tossToBegin()
		{
			int toss=(int)Math.floor(Math.random()*10)%2;
			if(toss==0){
				System.out.println("Player1 is your chance to play");
			}else
			{
				System.out.println("computer is your chance to play");
			}
		}

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the TicTacToe game");
		TicTacToe tictactoe = new TicTacToe();
		tictactoe.createBoard();// call the method in main class
		tictactoe.makeChoice();
		tictactoe.makeMove();
		tictactoe.showBoard(board);
	}
}
