package com.bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	private static char[] board = new char[10];
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
	public boolean validateMove(int location) {
		if (0 < location && location < 10) {
			if (board[location] != ' ') return false;
			return true;
		}
		return false;
	}

	public void makeUserMove() {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a location number ");
		int location = obj.nextInt();
		if (validateMove(location)) {
			board[location] = userChoice;
			counter++;
			checkGameStatus("User");
		} else {
			System.out.println("Sorry you have selected the wrong position try again");
			if(counter<=9) makeUserMove();
			else return;
		}
	}
	public void showBoard(char[] board) {
		System.out.println("\n" + board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("------");
		System.out.println(" " + board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("------");
		System.out.println(" " + board[7] + "|" + board[8] + "|" + board[9]);
	}

	public void makeMove(char[] board) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int i = sc.nextInt();
		if (0 < i && i < 10) {
			if (board[i] == ' ') {
				board[i] = player;
			} else {
				System.out.println("Already occupied");
			}
		}
	}
	public boolean allEqual(int a, int b, int c) {
		return (a == c) && (b == c);
	}

	public void checkGameStatus(String key) {
		displayBoard(board);
		// System.out.println(counter);
		if (counter <= 9) {
			for (int i = 1; i < 10; i = i + 3) {
				if (allEqual(board[i], board[i + 1], board[i + 2]) && board[i] != ' ') {
					System.out.println(key + " has won the game");
					return;
				}
			}
			for (int i = 1; i < 3; i = i + 1) {
				if (allEqual(board[i], board[i + 3], board[i + 6]) && board[i] != ' ') {
					System.out.println(key + " has won the game");
					return;
				}
			}
			if (allEqual(board[1], board[5], board[9]) && board[1] != ' ') {
				System.out.println(key + " has won the game");
				return;
			}
			if (allEqual(board[3], board[5], board[7]) && board[3] != ' ') {
				System.out.println(key + " has won the game");
				return;
			}
			if (key.equals("Computer") && counter <9) makeUserMove();
			else if (key.equals("User") && counter <9) makeComputerMove();
			else System.out.println("it's a tie");
		}
	}

	public static void main(String[] args) {
		int gamestatus = 0;
		TicTacToe game = new TicTacToe();
		System.out.println("welcome to TikTakToe");
		char[] board = game.createBoard();
		game.makeChoice();
		if (tossToBegin()) game.makeComputerMove();
		else game.makeUserMove();
	}
}}
}
