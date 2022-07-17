package org.example;

public class BoardGame {
    protected final int SIZE_BOARD = 3;

    public char[][] createBoardGame(){
        char[][] board = new char[SIZE_BOARD][SIZE_BOARD];
        for(int i = 0; i < SIZE_BOARD; i++) {
            for (int j = 0; j < SIZE_BOARD; j++) {
                board[i][j] = '-';
            }
        }
        return board;
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
