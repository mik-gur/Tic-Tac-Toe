package org.example;

import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);

    public void firstPlayerPlay(char[][] board, char firstPlayerSymbol){
        System.out.println("Enter the row and column: ");
        int rowIndex = scanner.nextInt();
        int colIndex = scanner.nextInt();

        while(board[rowIndex][colIndex] != ' '){
            System.out.println("This cell is already taken. Please try other row and column! ");
            rowIndex = scanner.nextInt();
            colIndex = scanner.nextInt();
        }

        board[rowIndex][colIndex] = firstPlayerSymbol;
    }

    public void secondPlayerPlay(char[][] board, char secondPlayerSymbol){
        System.out.println("Enter the row and column: ");
        int rowIndex = scanner.nextInt();
        int colIndex = scanner.nextInt();

        while(board[rowIndex][colIndex] != ' '){
            System.out.println("This cell is already taken. Please try other row and column! ");
            rowIndex = scanner.nextInt();
            colIndex = scanner.nextInt();
        }
        board[rowIndex][colIndex] = secondPlayerSymbol;
    }

    public void ComputerPlay(char[][] board, char computerSymbol){
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if(board[i][j] == ' '){
                    board[i][j] = computerSymbol;
                }
            }
        }
    }
}
