package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    private BoardGame boardGame = new BoardGame();
    private Player player1;
    private Player player2;

   public Game(Player player1,Player player2) {
      this.player1 = player1;
      this.player2 = player2;
}
    private char character;

    public void updateBoard(int position, Player player1, Player player2, char[][] board) {

        this.player1 = player1;
        this.player2 = player2;

        if (player2.getName().equals("Computer")) {
            character = player2.getSymbol();
        } else {
            character = player1.getSymbol();
        }

        switch (position) {

            case 1:
                board[0][0] = character;
                boardGame.drawBoard(board);
                break;
            case 2:
                board[0][1] = character;
                boardGame.drawBoard(board);
                break;
            case 3:
                board[0][2] = character;
                boardGame.drawBoard(board);
                break;
            case 4:
                board[1][0] = character;
                boardGame.drawBoard(board);
                break;
            case 5:
                board[1][1] = character;
                boardGame.drawBoard(board);
                break;
            case 6:
                board[1][2] = character;
                boardGame.drawBoard(board);
                break;
            case 7:
                board[2][0] = character;
                boardGame.drawBoard(board);
                break;
            case 8:
                board[2][1] = character;
                boardGame.drawBoard(board);
                break;
            case 9:
                board[2][2] = character;
                boardGame.drawBoard(board);
                break;
            default:
                break;

        }
    }

    public void playerMove(char[][] board, Player player, Player player2) {

        System.out.println("Please make a move: 1-9");

        int move = scanner.nextInt();

        boolean result = isValidMove(move, board);

        while (!result) {
            System.out.println("Sorry, valid move");
            move = scanner.nextInt();
            result = isValidMove(move, board);
        }
        updateBoard(move, player, player2, board);
    }

    public boolean isValidMove(int move, char[][] board) {
/*        char selectedChar = ' ';
        selectedChar = board[0][0];*/
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
                return false;
        }
    }

    public boolean isGameEnd(char[][] board, Player player) {
        //Horizontally wins
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        //Diagonally wins
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        //Vertically wins
        if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            if (player.getName().equals("Computer")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Player wins!");
            }
            return true;
        }
        return false;
    }

    public void computerPlay(char[][] board, Player player, Player player2) {

        Random rand = new Random();
        int move = rand.nextInt(9)+1;

        boolean result = isValidMove(move, board);

        while(!result){
            move = rand.nextInt(9)+1;
            result = isValidMove(move, board);
        }

        System.out.println("Computer moved at position "+ move);
        updateBoard(move,player2, player, board);
    }

    public void startGame(char[][] board, Player player, Player player2) {
        boolean gameOver = false;
        boolean playAgain = true;

        while (playAgain) {
            while (!gameOver) {
                boardGame.drawBoard(board);
                playerMove(board, player, player2);
                gameOver = isGameEnd(board, player);
                if (gameOver) {
                    break;
                }

                computerPlay(board, player2,player);
                gameOver = isGameEnd(board, player);
                if (gameOver) {
                    break;
                }
            }
        }
    }
}
