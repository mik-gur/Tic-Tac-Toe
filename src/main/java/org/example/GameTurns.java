package org.example;

import java.util.Scanner;

public class GameTurns {

    private Game game = new Game();

    private Player player = new Player();
    private BoardGame boardGame = new BoardGame();
    private Scanner scanner = new Scanner(System.in);
    private char firstTurn;

    private int turn;
    private int remainTurns = boardGame.SIZE_BOARD * boardGame.SIZE_BOARD;
    private boolean done;

    public void askForFirstTurn(){
        System.out.println("Do you want to start (y/n) ?");
        firstTurn = scanner.next().toLowerCase().charAt(0);

        if (firstTurn == 'y'){
            turn = 0;
            game.playerMove(boardGame.board);
        }
        else {
            turn = 1;
            game.ComputerPlay(boardGame.board, player.compSymbol);
        }
    }
}
