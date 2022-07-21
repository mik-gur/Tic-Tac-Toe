package org.example;

import java.util.Scanner;


public class GameTurns {

    private Player player1;
    private Player player2;

    public GameTurns(Player player1,Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private Game game = new Game(player1, player2);
    private BoardGame boardGame = new BoardGame();
    private Scanner scanner = new Scanner(System.in);
    private char firstTurn;

    private int turn;
    private int remainTurns = boardGame.SIZE_BOARD * boardGame.SIZE_BOARD;
    private boolean done;

    public void askForFirstTurn(char[][] board, Player player, Player player2){
        System.out.println("Do you want to start (y/n) ?");
        firstTurn = scanner.next().toLowerCase().charAt(0);

        if (firstTurn == 'y'){
            turn = 0;
            game.playerMove(board, player, player2);
        }
        else {
            turn = 1;
            game.computerPlay(board, player2, player);
        }
    }

    public int getTurn() {
        return turn;
    }
}
