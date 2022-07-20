package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Player player = new Player();
        GameTurns gameTurns = new GameTurns();
        BoardGame boardGame = new BoardGame();
        Game game = new Game();

        for (char[] chars : boardGame.board) {
            System.out.println(chars);
        }

        boardGame.resetBoard(boardGame.board);

        boardGame.drawBoard(boardGame.board);

        boardGame.resetBoard(boardGame.board);
        player.askPlayerForName();
        player.askPlayerForSymbol();
    }
}
