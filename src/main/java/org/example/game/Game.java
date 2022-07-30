package org.example.game;

import org.example.domain.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    private final GameEnd gameEnd = new GameEnd();
    private final GameBoard gameBoard = new GameBoard();
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private final GameTurns gameTurns = new GameTurns();


    public void startBotGame(char[][] board, Player player1, Player player2, GameMove gameMove) {
        boolean gameOver;
        boolean playAgain = true;
        boolean playerMoveDone = true;

        do {
            gameTurns.askForFirstTurn();
            gameBoard.drawBoard(board);
            do {
                if (gameTurns.playerStarts()) {
                    gameMove.playerMove(board, player1);
                    gameOver = gameEnd.isGameEnd(board, player1);
                    if (gameOver) {
                        break;
                    }

                    gameMove.computerPlay(board, player2);
                    gameOver = gameEnd.isGameEnd(board, player2);
                    if (gameOver) {
                        break;
                    }

                } else {
                    if (playerMoveDone)
                        gameMove.computerPlay(board, player2);
                    gameOver = gameEnd.isGameEnd(board, player2);
                    playerMoveDone = false;
                    if (gameOver) {
                        break;
                    }
                    gameMove.playerMove(board, player1);
                    gameOver = gameEnd.isGameEnd(board, player1);
                    playerMoveDone = true;
                    if (gameOver) {
                        break;
                    }
                }
            } while (!gameOver);
            System.out.println("Are we staring next game? y = yes, something else = no");
            scanner = new Scanner(System.in);
            try {
                char nextGame = scanner.nextLine().toLowerCase().charAt(0);
                if (nextGame == 'y') {
                    playAgain = true;
                    gameBoard.resetBoard(board);
                } else {
                    System.out.println("Thanks for playing!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter y or n");
            }
        } while (playAgain);
    }

    public void startPlayerVsPlayerGame(char[][] board, Player player1, Player player2, GameMove gameMove) {
        boolean gameOver;
        boolean playAgain = true;

        do {
            gameTurns.askForFirstTurn();
            gameBoard.drawBoard(board);
            do {
                if (gameTurns.playerStarts()) {
                    System.out.println("Turn " + player1.getName() + " player");
                    gameMove.playerMove(board, player1);
                    gameOver = gameEnd.isGameEnd(board, player1);
                    if (gameOver) {
                        break;
                    }

                    System.out.println("Turn " + player2.getName() + " player");
                    gameMove.playerMove(board, player2);
                    gameOver = gameEnd.isGameEnd(board, player2);
                    if (gameOver) {
                        break;
                    }
                } else {
                    System.out.println("Turn " + player2.getName() + " player");
                    gameMove.playerMove(board, player2);
                    gameOver = gameEnd.isGameEnd(board, player2);
                    if (gameOver) {
                        break;
                    }

                    System.out.println("Turn " + player1.getName() + " player");
                    gameMove.playerMove(board, player1);
                    gameOver = gameEnd.isGameEnd(board, player1);
                    if (gameOver) {
                        break;
                    }
                }
            } while (!gameOver);
            System.out.println("Are we staring next game? y = yes, something else = no");
            scanner = new Scanner(System.in);
            try {
                char nextGame = scanner.nextLine().toLowerCase().charAt(0);
                if (nextGame == 'y') {
                    playAgain = true;
                    gameBoard.resetBoard(board);
                } else {
                    System.out.println("Thanks for playing!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter y or n");
            }
        } while (playAgain);
    }
}
