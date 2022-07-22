package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    private GameEnd gameEnd = new GameEnd();
    private BoardGame boardGame = new BoardGame();
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    private GameTurns gameTurns = new GameTurns();
    private char character;

    public void updateBoard(int position, Player player1, char[][] board) {


        if (player1.getName().equals("Computer")) {
            character = this.player2.getSymbol();
        } else {
            character = this.player1.getSymbol();
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

    public void playerMove(char[][] board, Player player1) {

        System.out.println("Please make a move: 1-9");

        int move = scanner.nextInt();

        boolean result = isValidMove(move, board);

        while (!result) {
            System.out.println("This box is not empty! Choose another one!");
            move = scanner.nextInt();
            result = isValidMove(move, board);
        }
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

    public void startGame(char[][] board, Player player1, Player player2) {
        boolean gameOver = false;
        boolean playAgain = true;

        while (playAgain) {
            gameTurns.askForFirstTurn();
            while (!gameOver) {
                if (gameTurns.getTurn() == 0) {
                    boardGame.drawBoard(board);
                    playerMove(board, player1);
                    gameOver = gameEnd.isGameEnd(board, player1);
                    if (gameOver) {
                        break;
                    }

                    computerPlay(board, player2);
                    gameOver = gameEnd.isGameEnd(board, player2);
                    if (gameOver) {
                        break;
                    }
                } else {
                    boardGame.drawBoard(board);
                    computerPlay(board, player2);
                    gameOver = gameEnd.isGameEnd(board, player2);
                    if (gameOver) {
                        break;
                    }

                    playerMove(board, player1);
                    gameOver = gameEnd.isGameEnd(board, player1);
                    if (gameOver) {
                        break;
                    }
                }
            }
            System.out.println("Are we staring next game? y/n");
            scanner.nextLine();
            char nextGame = scanner.nextLine().toLowerCase().charAt(0);
            if(nextGame == 'y'){
                playAgain = true;
                boardGame.resetBoard(board);
                gameOver = false;
            }
            else {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
