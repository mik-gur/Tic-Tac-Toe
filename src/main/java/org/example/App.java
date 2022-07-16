package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        BoardGame boardGame = new BoardGame();
        boardGame.drawBoard(boardGame.createBoardGame());
    }
}
