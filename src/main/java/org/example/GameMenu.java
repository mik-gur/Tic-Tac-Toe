package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMenu {
    private Scanner scanner = new Scanner(System.in);
    public void startGame(){
        boolean loopMenuIsEnd = false;
        System.out.println("!!Welcome in game Tic Tac Toe!!");

        Integer option = null;
        while (!loopMenuIsEnd) {
            System.out.println("0. Close game. | 1.Play with computer. | 2. 2 players game");
            scanner = new Scanner(System.in);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 0:
                        System.out.println("Closing game");
                        loopMenuIsEnd = true;
                        break;
                    case 1:
                        startGameWithBot();
                        break;
                    case 2:
                        starGameWithOtherPlayer();
                        break;
                    default:
                        System.out.println("Choose one of the available options!");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter an integer!");
            }
        }
    }

    private void startGameWithBot() {
        BoardGame boardGame = new BoardGame();

        boardGame.resetBoard(boardGame.board);

        Player player = new Player();
        Player computer = new Player(player);
        Game game = new Game(player, computer);

        game.startBotGame(boardGame.board, player, computer);
    }

    private void starGameWithOtherPlayer() {
        BoardGame boardGame = new BoardGame();

        boardGame.resetBoard(boardGame.board);

        Player player = new Player();
        Player player2 = new Player(player.getSymbol());
        Game game = new Game(player, player2);

        game.startPlayerVsPlayerGame(boardGame.board, player, player2);
    }
}
