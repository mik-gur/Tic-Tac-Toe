package org.example.game;

import org.example.domain.Player;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GameMove {

    private Scanner scanner = new Scanner(System.in);

    private Player player1;
    private Player player2;

    public GameMove(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private char character;

    public void updateBoard(int position, Player player1, char[][] board) {

        final GameBoard gameBoard = new GameBoard();


        if (player1.getName().equals("Computer")) {
            character = this.player2.getSymbol();
        } else if (player1.getName().equals(player2.getName())) {
            character = this.player2.getSymbol();
        } else {
            character = this.player1.getSymbol();
        }

        switch (position) {

            case 1:
                board[0][0] = character;
                gameBoard.drawBoard(board);
                break;
            case 2:
                board[0][1] = character;
                gameBoard.drawBoard(board);
                break;
            case 3:
                board[0][2] = character;
                gameBoard.drawBoard(board);
                break;
            case 4:
                board[1][0] = character;
                gameBoard.drawBoard(board);
                break;
            case 5:
                board[1][1] = character;
                gameBoard.drawBoard(board);
                break;
            case 6:
                board[1][2] = character;
                gameBoard.drawBoard(board);
                break;
            case 7:
                board[2][0] = character;
                gameBoard.drawBoard(board);
                break;
            case 8:
                board[2][1] = character;
                gameBoard.drawBoard(board);
                break;
            case 9:
                board[2][2] = character;
                gameBoard.drawBoard(board);
                break;
            default:
                break;

        }
    }

    public void playerMove(char[][] board, Player player1) {
        System.out.println("Please make a move: 1-9");

        int move = 0;

        boolean isValidMove = false;

        do {
            scanner = new Scanner(System.in);
            try {
                move = scanner.nextInt();
                isValidMove = isValidMove(move, board);
                if (!isValidMove) {
                    System.out.println("This box is not empty! Choose another one!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter integer between 1 and 9!");
            }
        } while (!isValidMove);

        updateBoard(move, player1, board);
    }

    public void computerPlay(char[][] board, Player player2) {

        Random rand = new Random();
        int move = rand.nextInt(9) + 1;

        boolean result = isValidMove(move, board);

        while (!result) {
            move = rand.nextInt(9) + 1;
            result = isValidMove(move, board);
        }
        updateBoard(move, player2, board);
        System.out.println("Computer moved at position " + move);
    }

    public boolean isValidMove(int move, char[][] board) {
        switch (move) {
            case 1:
                return board[0][0] == ' ';
            case 2:
                return board[0][1] == ' ';
            case 3:
                return board[0][2] == ' ';
            case 4:
                return board[1][0] == ' ';
            case 5:
                return board[1][1] == ' ';
            case 6:
                return board[1][2] == ' ';
            case 7:
                return board[2][0] == ' ';
            case 8:
                return board[2][1] == ' ';
            case 9:
                return board[2][2] == ' ';
            default:
                System.out.println("You must enter an integer between 1 and 9!");
                return false;
        }
    }
}
