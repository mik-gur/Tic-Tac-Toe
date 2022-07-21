package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        BoardGame boardGame = new BoardGame();

        boardGame.resetBoard(boardGame.board);

        System.out.println("!!Welcome in game Tic Tac Toe!!");
        Player player = new Player();
        Player computer = new Player(player);
        Game game = new Game(player, computer);

        game.startGame(boardGame.board, player, computer);
    }
}
