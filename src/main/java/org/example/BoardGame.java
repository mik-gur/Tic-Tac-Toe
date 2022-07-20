package org.example;

public class BoardGame {
    protected final int SIZE_BOARD = 3;
    protected char[][] board = new char[SIZE_BOARD][SIZE_BOARD];

    public void resetBoard(char[][] board)
    {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                board[i][j] = ' ';
    }

    public void drawBoard(char[][] board){
        System.out.println("Board: \n");

        for(int i = 0; i < board.length; i++){
            System.out.print("|");
            for(int j= 0; j <board[i].length; j++){
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

}
